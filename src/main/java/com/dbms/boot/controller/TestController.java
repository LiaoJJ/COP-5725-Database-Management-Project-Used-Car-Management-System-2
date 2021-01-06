package com.dbms.boot.controller;

import com.dbms.boot.entities.Data;
import com.dbms.boot.entities.Form;
import com.dbms.boot.entities.Trend7;
import com.dbms.boot.entities.User;
import com.dbms.boot.repository.TestRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class TestController {

    @Autowired
    TestRepository testRepository;

    @GetMapping("/test")
    public String test(){
        return testRepository.countListing().toString();
    }







//    @GetMapping("/search/form")
//    public String search_form(Model model){
//        model.addAttribute("form", new Form());
//        return "search/search-form";
//    }
//
//    @GetMapping("/search/show")
//    public String search_show(Model model){
//        Data data1 = new Data();
//        data1.setListingUrl("https://www.tesla.com/");
//        data1.setColor("blue");
//        data1.setPrice("10000");
//        data1.setModel("Corolla");
//        data1.setManufacturer("Toyota");
//        Data data2 = new Data();
//        data2.setColor("red");
//        data2.setPrice("20001");
//        data2.setModel("Model3");
//        data2.setManufacturer("Tesla");
//        List<Data> datas = Arrays.asList(data1, data2);
//        model.addAttribute("datas", datas);
//        return "search/search-show";
//    }

    // 1
//    @GetMapping("/trend1/form")
//    public String trend1_form(Model model){
//        model.addAttribute("form", new Form());
//        return "trend/trend1-form";
//    }

//    @GetMapping("/trend1/show")
//    public String trend1_show(Model model) throws JsonProcessingException {
//        Trend7 t1 = new Trend7(2010, 11111, "Price", 2123, "numOf");
//        Trend7 t2 = new Trend7(2011, 22222, "Price", 3333, "numOf");
//        Trend7 t3 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        Trend7 t4 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        List<Trend7> trend1s = Arrays.asList(t1, t2, t3, t4);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(trend1s);
//        model.addAttribute("jsonString", jsonString);
//        return "trend/trend1-show";
//    }

    // 2
//    @GetMapping("/trend2/form")
//    public String trend2_form(Model model){
//        model.addAttribute("form", new Form());
//        return "trend/trend2-form";
//    }
//
//    @GetMapping("/trend2/show")
//    public String trend2_show(Model model) throws JsonProcessingException {
//        Trend7 t1 = new Trend7(2010, 11111, "Price", 2123, "numOf");
//        Trend7 t2 = new Trend7(2011, 22222, "Price", 3333, "numOf");
//        Trend7 t3 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        Trend7 t4 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        List<Trend7> trend1s = Arrays.asList(t1, t2, t3, t4);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(trend1s);
//        model.addAttribute("jsonString", jsonString);
//        return "trend/trend2-show";
//    }

    //3
//    @GetMapping("/trend3/form")
//    public String trend3_form(Model model){
//        model.addAttribute("form", new Form());
//        return "trend/trend3-form";
//    }
//
//    @GetMapping("/trend3/show")
//    public String trend3_show(Model model) throws JsonProcessingException {
//        Trend7 t1 = new Trend7(2010, 11111, "Price", 2123, "numOf");
//        Trend7 t2 = new Trend7(2011, 22222, "Price", 3333, "numOf");
//        Trend7 t3 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        Trend7 t4 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        List<Trend7> trend1s = Arrays.asList(t1, t2, t3, t4);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(trend1s);
//        model.addAttribute("jsonString", jsonString);
//        return "trend/trend3-show";
//    }

    // 2
//    @GetMapping("/trend4/form")
//    public String trend4_form(Model model){
//        model.addAttribute("form", new Form());
//        return "trend/trend4-form";
//    }
//
//    @GetMapping("/trend4/show")
//    public String trend4_show(Model model) throws JsonProcessingException {
//        Trend7 t1 = new Trend7(2010, 11111, "Price", 2123, "numOf");
//        Trend7 t2 = new Trend7(2011, 22222, "Price", 3333, "numOf");
//        Trend7 t3 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        Trend7 t4 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        List<Trend7> trend1s = Arrays.asList(t1, t2, t3, t4);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(trend1s);
//        model.addAttribute("jsonString", jsonString);
//        return "trend/trend4-show";
//    }

    // 5
//    @GetMapping("/trend5/form")
//    public String trend5_form(Model model){
//        model.addAttribute("form", new Form());
//        return "trend/trend5-form";
//    }
//
//    @GetMapping("/trend5/show")
//    public String trend5_show(Model model) throws JsonProcessingException {
//        Trend7 t1 = new Trend7(2010, 11111, "Price", 2123, "numOf");
//        Trend7 t2 = new Trend7(2011, 22222, "Price", 3333, "numOf");
//        Trend7 t3 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        Trend7 t4 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        List<Trend7> trend1s = Arrays.asList(t1, t2, t3, t4);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(trend1s);
//        model.addAttribute("jsonString", jsonString);
//        return "trend/trend5-show";
//    }

    // 6
//    @GetMapping("/trend6/form")
//    public String trend6_form(Model model){
//        model.addAttribute("form", new Form());
//        return "trend/trend6-form";
//    }
//
//    @GetMapping("/trend6/show")
//    public String trend6_show(Model model) throws JsonProcessingException {
//        Trend7 t1 = new Trend7(2010, 11111, "Price", 2123, "numOf");
//        Trend7 t2 = new Trend7(2011, 22222, "Price", 3333, "numOf");
//        Trend7 t3 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        Trend7 t4 = new Trend7(2012, 11111, "Price", 1232, "numOf");
//        List<Trend7> trend1s = Arrays.asList(t1, t2, t3, t4);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(trend1s);
//        model.addAttribute("jsonString", jsonString);
//        return "trend/trend6-show";
//    }

    // 7
//    @GetMapping("/trend7/form")
////    public String trend7_form(Model model){
////        model.addAttribute("form", new Form());
////        return "trend/trend7-form";
////    }

//    @GetMapping("/trend7/show")
//    public String trend7_show(Model model) throws JsonProcessingException {
//        Trend7 t1 = new Trend7(2010, 11111, "Bencz", 2123, "Audi", 3333, "Tesla");
//        Trend7 t2 = new Trend7(2011, 2222, "Audi", 3333, "Bencz", 4444, "Audi");
//        Trend7 t3 = new Trend7(2012, 11111, "Audi", 1232, "Bencz", 12312, "Tesla");
//        Trend7 t4 = new Trend7(2012, 11111, "Tesla", 1232, "Tesla", 12312, "Bencz");
//        Trend7 t5 = new Trend7(2013, 1111, "Honda", 122, "Toyota", 1312, "Tesla");
//        List<Trend7> trend1s = Arrays.asList(t1, t2, t3, t4, t5);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonString = objectMapper.writeValueAsString(trend1s);
//        model.addAttribute("jsonString", jsonString);
//        return "trend/trend7-show";
//    }

    // 8
    @GetMapping("/trend8/form")
    public String trend8_form(Model model){
        model.addAttribute("form", new Form());
        return "trend/trend8-form";
    }

    @GetMapping("/trend8/show")
    public String trend8_show(Model model) throws JsonProcessingException {
        Trend7 t1 = new Trend7(2010, 11, "FL", 22, "AZ", 33, "LA", 44, "CZ", 55, "DC");
        Trend7 t2 = new Trend7(2011, 55, "FL", 44, "AZ", 33, "LA", 22, "CZ", 11, "DC");
        Trend7 t3 = new Trend7(2012, 43, "FL", 25, "AZ", 47, "LA", 123, "CZ", 23, "DC");
        Trend7 t4 = new Trend7(2012, 24, "FF", 63, "RF", 14, "BF", 74, "CZ", 24, "DC");
        Trend7 t5 = new Trend7(2013, 53, "BZ", 13, "ZB", 74, "GR", 13, "CZ", 53, "DC");
        List<Trend7> trend1s = Arrays.asList(t1, t2, t3, t4, t5);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(trend1s);
        model.addAttribute("jsonString", jsonString);
        return "trend/trend8-show";
    }

}
