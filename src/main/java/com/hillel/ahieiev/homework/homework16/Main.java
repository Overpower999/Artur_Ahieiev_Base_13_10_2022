package com.hillel.ahieiev.homework.homework16;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new PopMusic("Ragate"),
                new RockMusic("Analytika"),
                new ClassicMusic("Rokkobar")
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }

    }
}
