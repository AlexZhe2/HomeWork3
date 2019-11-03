package com.domain.lesson6.units;

import java.util.ArrayList;

public class King implements RestAble{

    private static String name;
    private static int gold;

    // модификатор с private изменять нельзя!!!
    // другие конструкторы создавать нельзя!!!
    private King(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    public static void alternativeConstructor(String nameOfKing, int goldOfKing){

        setName(nameOfKing);
        setGold(goldOfKing);
    }

    public static void setName(String name1) {
        name = name1;
    }

    public static void setGold(int gold1) {
        gold = gold1;
    }

    public static String getName() {
        return name;
    }

    public static int getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", gold=" + gold +
                '}';
    }

    @Override
    public void rest() {
        System.out.println("Король отдыхает");
    }
}
