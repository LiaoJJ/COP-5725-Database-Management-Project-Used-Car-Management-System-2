package com.dbms.boot.util;

import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Build Phase:
 *  Input: (key, Text)
 *  Output: void
 * Search Phase:
 *  Input: a String consist of Key words
 *  Output: List<String>
 */

@Service
public class MyElasticSearch {

    private Map<String, Set<String>> word2idList = new HashMap<>(64);
    private Map<String, String> id2text = new HashMap<>(64);

    public void add(String id, String text){
        id2text.put(id, text);
        for(String word: text.trim().split("[\\s,:{};.\"'#]+")){
            word = word.toLowerCase();
            word2idList.putIfAbsent(word, new HashSet<>());
            word2idList.get(word).add(id);
        }
    }

    public List<String> search(String keyWords, int outputNum){
        HashMap<String, Integer> id2score = new HashMap<>(64);
        for(String word: keyWords.trim().toLowerCase().split("[\\s,:{};.\"'#]+")){
            if(word2idList.containsKey(word)){
                for(String id: word2idList.get(word)){
                    id2score.putIfAbsent(id, 0);
                    id2score.put(id, id2score.get(id) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list =  new ArrayList<>(id2score.entrySet());
        list.sort((a, b)->{
           return b.getValue() - a.getValue();
        });
        List<String> res = new ArrayList<>(outputNum);
        outputNum = Math.min(outputNum, list.size());
        for(int i=0; i<outputNum; i++){
            res.add(id2text.get(list.get(i).getKey()));
        }
        return res;
    }
}
