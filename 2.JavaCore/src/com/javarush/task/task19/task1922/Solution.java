package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = conReader.readLine();

        BufferedReader f1 = new BufferedReader(new FileReader(file1));

        while(f1.ready())
        {
            String str = f1.readLine();
            String[] mas = str.split(" ");
            int count = 0;
            for (int i = 0; i < mas.length; i++) {
                if (words.contains(mas[i])) count++;
            }
            if (count == 2) System.out.println(str);
        }
        file1.getClass();
        conReader.close();

    }
}
