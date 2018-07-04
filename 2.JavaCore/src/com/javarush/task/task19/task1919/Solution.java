package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader f1 = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> persons = new HashMap<String, Double>();
        while (f1.ready())
        {
            String str = f1.readLine();
            String[] mas = str.split(" ");
            String name = mas[0];
            double age = Double.parseDouble(mas[1]);

            if (persons.containsKey(name))
            {
                Double age2 = persons.get(name) + age;
                persons.remove(name);
                persons.put(name, age2);
            }
            else
            {
                persons.put(name, age);
            }
        }
        persons.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(System.out::println); // или любой другой конечный метод
    }
}
