package com.dbms.boot.service;

import com.dbms.boot.util.MyElasticSearch;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyElasticSearchTest {

    @Autowired
    MyElasticSearch myElasticSearch;

    @Test
    void add() {
        myElasticSearch.add("1", "abc def ghi");
        myElasticSearch.add("2", "def ghi jkl");
        myElasticSearch.add("3", "hahahaha, eeee");
//        System.out.println(myElasticSearch.id2text);
//        System.out.println(myElasticSearch.word2idList);
        System.out.println(myElasticSearch.search(("def"), 1));
        System.out.println(myElasticSearch.search(("def"), 100));
        System.out.println(myElasticSearch.search(("cccasd"), 100));
        System.out.println(myElasticSearch.search(("eeee"), 100));
    }

    @Test
    void search() {
    }
}