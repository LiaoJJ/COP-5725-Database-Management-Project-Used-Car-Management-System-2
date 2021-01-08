package com.dbms.boot.service;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.dbms.boot.entities.SearchResPara;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import sun.net.www.http.HttpClient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;


import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class SearchServiceDropped implements InitializingBean {

    public List<SearchResPara> elasticSearch(String q) throws IOException {
        JSONObject json = readJsonFromUrl("http://127.0.0.1:9200/blogposts/_doc/_search?q=" + q.replace(" ", "%20"));
        JSONArray jsonArray = json.getJSONObject("hits").getJSONArray("hits");
        List<SearchResPara> res = new ArrayList<>();
        for(int i=0; i<jsonArray.size(); i++) {
            JSONObject o = jsonArray.getJSONObject(i).getJSONObject("_source");
            SearchResPara searchResPara = new SearchResPara(o.getBigDecimal("LISTING_ID"), o.getInteger("YEAR"), o.getBigDecimal("PRICE"), o.getString("COLOR"), o.getBigDecimal("ODOMETER"), o.getString("TITLE_STATUS"), o.getString("CONDITION"), o.getString("REGION"), o.getString("STATE"), o.getString("MODEL"), o.getString("DESIGNED_BY"));
            res.add(searchResPara);
        }
        return res;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        // process the .csv file, do not block the main Thread
        new Thread(()->{
            // wait for Heroku to bind the port
            try {
                Thread.sleep(10000);
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
                System.out.println("/vehicles.csv not exist");
                return;
            }
            SerializeConfig config = new SerializeConfig(); // 生产环境中，config要做singleton处理，要不然会存在性能问题
            config.propertyNamingStrategy = PropertyNamingStrategy.PascalCase;

//        HTTP_DELETE("http://127.0.0.1:9200/blogposts");
            try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
                String[] l = reader.readNext(); // header
                while ((l = reader.readNext()) != null) {
                    try {
                        SearchResPara searchResPara = new SearchResPara(new BigDecimal(l[0]), new Integer(l[5]), new BigDecimal(l[4]), l[18], new BigDecimal(l[11]), l[12], l[8], l[21], l[22], l[7], l[6]);
                        String json = JSON.toJSONString(searchResPara, config);
//                    System.out.println(json);

//                    HTTP_POST("http://127.0.0.1:9200/blogposts/_doc", json);
                    } catch (Exception e) {

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("vehicles.csv process done");
        }).start();

    }

    private void HTTP_POST(String postUrl, String body) throws IOException {
        CloseableHttpClient httpClient    = HttpClientBuilder.create().build();
        try{
            HttpPost     post          = new HttpPost(postUrl);
            StringEntity postingString = new StringEntity(body);//gson.tojson() converts your pojo to json
            post.setEntity(postingString);
            post.setHeader("Content-type", "application/json");
            HttpResponse  response = httpClient.execute(post);
            httpClient.close();
        } catch (NumberFormatException e){

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            httpClient.close();
        }
    }

    private void HTTP_DELETE(String url) throws IOException {
        CloseableHttpClient httpClient    = HttpClientBuilder.create().build();
        try{
            HttpDelete     delete          = new HttpDelete(url);
            delete.setHeader("Content-type", "application/json");
            HttpResponse  response = httpClient.execute(delete);
            httpClient.close();
        } catch (NumberFormatException e){

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            httpClient.close();
        }
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    private static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = JSONObject.parseObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
}
