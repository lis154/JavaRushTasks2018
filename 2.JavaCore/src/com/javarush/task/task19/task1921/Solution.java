package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader f1 = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> persons = new HashMap<String, Double>();
        while (f1.ready()) {
            String str = f1.readLine();
            if (!(str.equals(""))) {
                String[] mas = str.split(" ");
                String name = "";
                for (int i = 0; i < mas.length-3; i++) {
                    name = name + " " + mas[i];
                }
                String date1 = mas[mas.length-3] + " " + mas[mas.length-2] + " " + mas[mas.length-3];
                SimpleDateFormat formatter = new SimpleDateFormat("MM dd yyyy");//задаю формат даты
                Date date = formatter.parse(date1);//создаю дату черезSystem.out.println(formatter.format(date));
                PEOPLE.add(new Person(name, date));
            }
        }
    }
}
