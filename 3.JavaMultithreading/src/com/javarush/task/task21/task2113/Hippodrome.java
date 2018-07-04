package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static List<Horse> horses = new ArrayList<Horse>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {
        Hippodrome game = null;
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();

        horse1.setName("horse1");
        horse1.setSpeed(3);
        horse1.setDistance(0);

        horse2.setName("horse2");
        horse2.setSpeed(3);
        horse2.setDistance(0);

        horse3.setName("horse3");
        horse3.setSpeed(3);
        horse3.setDistance(0);

        //List<Horse> horseList = new ArrayList<>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        //game.setHorses(horseList);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();


    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i < 30; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse h : horses) {
            h.move();
        }
    }

    public void print() {
        for (Horse h : horses) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }

    public Horse getWinner() {
        double max = 0;
        for (Horse h : horses) {
            if (max < h.getDistance()) max = h.getDistance();
        }

        for (Horse h : horses) {
            if (max == h.getDistance()) return h;
        }
        return null;

    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName());
    }


}

