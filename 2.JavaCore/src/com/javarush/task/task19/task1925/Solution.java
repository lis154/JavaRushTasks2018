package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {




        BufferedReader f1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter f2 = new BufferedWriter(new FileWriter(args[1]));
        int g = 0;
        while (f1.ready()) {
            String[] mas = f1.readLine().split(" ");
            String str = "";
            for (int i = 0; i < mas.length; i++) {

                if (mas[i].length() > 6)
                {

                    if (g > 0) {
                        f2.write("," + mas[i]);
                    } else
                    {
                        f2.write(mas[i]);
                        g++;
                    }
                }

            }
        }
        f1.close();
        f2.close();
    }
}
