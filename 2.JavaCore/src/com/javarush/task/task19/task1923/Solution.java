package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        while (reader.ready())
        {
            String[] arg = reader.readLine().split(" ");
            for (int i = 0; i < arg.length; i++) {
                if (isValidWord(arg[i])) {
                    writer.write(arg[i]);
                }
            }

        }
        reader.close();
        writer.close();
    }
    private static boolean isValidWord(String word) {
        return word.matches("[1-9]+"); // если говорим о Латинице
    }
}
