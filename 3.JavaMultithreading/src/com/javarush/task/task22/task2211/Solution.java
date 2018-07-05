package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("C:\\test\\1.txt");
        FileOutputStream outputStream = new FileOutputStream("C:\\test\\2.txt");

        Charset windows_1251 = Charset.forName("Windows-1251");
        Charset utf_8 = Charset.forName("UTF-8");


        while (inputStream.available() > 0) {
            byte[] buffer = new byte[1000];
            inputStream.read(buffer);
            String s = new String(buffer, windows_1251);
            buffer = s.getBytes(utf_8);
            outputStream.write(buffer);
        }

        inputStream.close();
        outputStream.close();
    }
}
