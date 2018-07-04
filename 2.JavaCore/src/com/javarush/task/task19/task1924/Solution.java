package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) throws IOException {

        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = conReader.readLine();

        BufferedReader f1 = new BufferedReader(new FileReader(file1));

        while (f1.ready())
        {
            String[] mas = f1.readLine().split(" ");
            for (int i = 0; i < mas.length; i++) {
               if (isNumber(mas[i])) {
               int chislo = Integer.parseInt(mas[i]);
                   if (map.containsKey(chislo)) {
                       for (Map.Entry<Integer, String> e : map.entrySet()) {
                           Integer key = e.getKey();
                           String value = e.getValue();
                           if (key == chislo) mas[i] = value;
                       }
                   }
               }
            }
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
            System.out.println();


        }

    }
    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return  true;
    }

}
