package com.hillel.ahieiev.homework.homework2;

public class MyCoordinates {
    public static void main(String[] args) {
        System.out.println("Координаты Стоунхэнджа:");
        System.out.println();
        String coordinatesStonehenge = "51°10′43″ с. ш. 1°49′35″ з. д.";
        System.out.println(coordinatesStonehenge);
        double latitude = 51.178844;
        double longitude = -1.826189;
        System.out.println(latitude + "° широты " + longitude + "° долготы.");
    }
}
