package com.hillel.ahieiev.homework.homework16;

public class RockMusic extends MusicStyles {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " группа жанра Рок.");
    }
}
