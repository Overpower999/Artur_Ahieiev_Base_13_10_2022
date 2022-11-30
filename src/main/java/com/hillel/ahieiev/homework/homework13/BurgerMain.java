package com.hillel.ahieiev.homework.homework13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burgerOriginal = new Burger("Булочка", "Мясо", "Сыр", "Зелень", "Майонез");
        System.out.println();
        Burger burgerDoubleMeat = new Burger("Булочка", "Мясо", "Сыр", "Зелень", "Майонез", "Двойное мясо");
        System.out.println();
        Burger burgerDiet = new Burger("Булочка", "Мясо", "Сыр", "Зелень");
    }
}
