package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.entity.Bread;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread("white", "best", 2.5);

        System.out.println(bread);
    }
}

