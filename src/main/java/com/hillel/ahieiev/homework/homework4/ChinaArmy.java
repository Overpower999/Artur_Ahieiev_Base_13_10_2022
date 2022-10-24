package com.hillel.ahieiev.homework.homework4;

public class ChinaArmy {
    public static void main(String[] args) {
        // Кількість війська
        int unitTypeLi = 860;
        // Клан Li показники атаки
        int warriorLi = 13;
        int bowmanLi = 24;
        int riderLi = 46;
        // Подрахунок потужності
        double powerLi = (unitTypeLi * warriorLi) + (unitTypeLi * bowmanLi) + (unitTypeLi * riderLi);
        // Клан  Min показники атаки
        int warriorMin = 9;
        int bowmanMin = 35;
        int riderMin = 12;
        // Кількість війська
        double unitTypeMin = unitTypeLi * 1.5;
        // Подрахунок потужності
        double powerMin = (unitTypeMin * warriorMin) + (unitTypeMin * bowmanMin) + (unitTypeMin * riderMin);
        //
        //
        //
        System.out.println("Потужність армії Лі : " + powerLi);
        System.out.println("Потужність армії Мінь : " + powerMin);

    }
}
