package com.dbms.boot.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.dbms.boot.entities.SearchResPara;
import com.dbms.boot.util.MyElasticSearch;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class SearchService implements InitializingBean {

    @Autowired
    MyElasticSearch myElasticSearch;

    public List<SearchResPara> elasticSearch(String q) throws IOException {
        List<String> list = myElasticSearch.search(q, 100);
        List<SearchResPara> res = list.stream()
                .map(s->s.split("#"))
                .filter(o -> o.length==11)
                .map(o-> {
                    try {
                        SearchResPara s = new SearchResPara(o);
                        return s;
                    } catch(Exception e){
                        return null;
                    }
                })
                .filter(o->null!=o)
                .collect(Collectors.toList());
        return res;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        // start a new Thread to process the .csv file, do not block the main Thread
        new Thread(()->{
            // wait for Heroku to bind the port
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Path dir = Paths.get("/");

            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.*")) {
                for (Path file : stream) {
                    System.out.println(file.toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            String fileName = "/vehicles.csv";
            File f = new File(fileName);
            if(!f.exists()) {
                System.out.println("/vehicles.csv not exist");
                System.out.println("/vehicles.csv not exist");
                System.out.println("/vehicles.csv not exist");
                return;
            }
            SerializeConfig config = new SerializeConfig();
            config.propertyNamingStrategy = PropertyNamingStrategy.PascalCase;

            try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
                String[] l = reader.readNext(); // header
                while ((l = reader.readNext()) != null) {
                    int size = 0;
                    for(int i=0; i<l.length; i++){
                        size += l[i].length();
                    }
                    if(size>=50) continue;
                    try {
                        String text = String.join("#", Arrays.asList(l[0], l[5], l[4], l[18], l[11], l[12], l[8], l[21], l[22], l[7], l[6]));
                        System.out.println(text);
                        myElasticSearch.add(l[0], text);
                    } catch (Exception e) {

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("vehicles.csv process done");
        }).start();
    }
}
