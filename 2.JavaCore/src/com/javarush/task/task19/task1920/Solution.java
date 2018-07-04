package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader f1 = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> persons = new HashMap<String, Double>();
        while (f1.ready())
        {
            String str = f1.readLine();
            if (!(str.equals(""))) {
                String[] mas = str.split(" ");
                String name = mas[0];
                System.out.println(mas[1]);

                double age = Double.parseDouble(mas[1]);

                if (persons.containsKey(name)) {
                    Double age2 = persons.get(name) + age;
                    persons.remove(name);
                    persons.put(name, age2);
                } else {
                    persons.put(name, age);
                }
            }
        }
        Double max= 0.0;
        Iterator it = persons.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Double t = (Double) pair.getValue();
            if (max < t) max = t;
        }

        TreeMap<Object, Object> treeMap = new TreeMap<>();
        Iterator it1 = persons.entrySet().iterator();
        System.out.println(max);
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Double t = (Double) pair.getValue();
            if (max == t) treeMap.put(pair.getKey(), pair.getValue());
        }
        System.out.println(treeMap.toString());
        Iterator it2 = treeMap.entrySet().iterator();
        while(it2.hasNext())
        {
            System.out.println(it2.next().toString());
        }

    }
}
