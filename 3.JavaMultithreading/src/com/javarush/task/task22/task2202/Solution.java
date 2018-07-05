package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

        //int n = string.indexOf(" ");
        String[] mas = string.split(" ");
        if (mas.length < 4) {
            throw new TooShortStringException();
        }
        String got = mas[1];
        for (int i = 2; i < 5; i++) {
            got = " " + mas[i];
        }
        return got;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
