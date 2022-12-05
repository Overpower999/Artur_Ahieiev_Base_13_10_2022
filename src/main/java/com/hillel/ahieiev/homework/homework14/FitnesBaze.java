package com.hillel.ahieiev.homework.homework14;

public class FitnesBaze {

    private final String name;
    private final int day;
    private final int mounth;
    private final int year;
    private final String mail;
    private final String telefonNumber;
    private String surname;
    private double weight;
    private String pressure;
    private int numberSteps;

    private int age;

    public FitnesBaze(String name, int day, int mounth, int year, String mail, String telefonNumber, String surname,
                      double weight, String pressure, int numberSteps) {

        this.name = name;
        this.day = day;
        this.mounth = mounth;
        this.year = year;
        age = 2020 - year;
        this.mail = mail;
        this.telefonNumber = telefonNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberSteps = numberSteps;
    }


    public int getMounth() {
        return mounth;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getNumberSteps() {
        return numberSteps;
    }

    public void setNumberSteps(int numberSteps) {
        this.numberSteps = numberSteps;
    }

    public int getAge() {
        return age;
    }

    void printAccountInfo() {
        System.out.println("Данные клиента : " + "\n" +
                "Имя : " + getName() + "\n" + "Дата рождения : " + getDay() + "." + getMounth() + "."
                + getYear() + "\n" + "Эмеил : " + getMail() + "\n" + "Телефон : " + getTelefonNumber()
                + "\n" + "Фамилия : " + getSurname() + "\n" + "Вес : " + getWeight() +
                "\n" + "Давление : " + getPressure() + "\n" + "Количевство пройденых шагов : "
                + getNumberSteps() + "\n" + "Возвраст : " + getAge() + "\n" + "-----------------" + "\n");
    }

}
