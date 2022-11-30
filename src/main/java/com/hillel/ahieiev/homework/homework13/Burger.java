package com.hillel.ahieiev.homework.homework13;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String doubleMeat;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {

        System.out.println("Обычный бургер");
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Состав бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {

        System.out.println("Диетический бургер");
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Состав бургера: " + bun + ", " + meat + ", " + cheese + ", " + greens);

    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String doubleMeat) {

        System.out.println("Бургер с двойным мясом");
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println("Состав бургера: " + bun + ", " + doubleMeat + ", " + greens + ", " + mayonnaise + ", " + cheese);


    }

}
