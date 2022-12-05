package com.hillel.ahieiev.homework.homework14;

public class FitnesBar {
    public static void main(String[] args) {

        FitnesBaze afonya = new FitnesBaze("Afonya", 31, 05, 2001, "afonya321@mail.ua", "+3809552324",
                "Gazmanov", 90.4, "80/110", 4532);

        afonya.printAccountInfo();

        FitnesBaze sasha = new FitnesBaze("Sasha", 28, 12, 1998, "sasha2323@gmail.com", "+3806342324",
                "Shatunovski", 80.2, "70/100", 2443);

        sasha.printAccountInfo();

        FitnesBaze ivan = new FitnesBaze("Ivan", 31, 10, 1980, "ivan12@icloud.com", "+3806722324",
                "Leontev", 65.6, "80/120", 3234);

        ivan.printAccountInfo();

        afonya.setSurname("Poplavscki");
        afonya.printAccountInfo();

        sasha.setNumberSteps(64232);
        sasha.printAccountInfo();

    }
}
