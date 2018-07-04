package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = conReader.readLine();

        BufferedReader f1 = new BufferedReader(new FileReader(file1));

        while (f1.ready())
        {
            String str = f1.readLine();
            String reverse = new StringBuffer(str).reverse().toString();
            System.out.println(reverse);
        }
        f1.close();

    }
}
