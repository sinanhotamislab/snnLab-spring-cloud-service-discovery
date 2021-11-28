package com.snnlab.servicediscovery;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String magazine[] = {"Two","asda","Two","Two","asdasdasda"};
        Map<String,Integer> magazineMap = new Hashtable<>();

        String a = "123124";

        String b = "123123";





        Map<String,Integer> s1CharMap = new HashMap<>();

        for(String magazineWord : magazine){
            Integer val = magazineMap.get(magazineWord);
            if(val == null) {
                val = 0;
            }
            val++;
            magazineMap.put(magazineWord, val);
        }


        System.out.println(magazineMap);

    }
}
