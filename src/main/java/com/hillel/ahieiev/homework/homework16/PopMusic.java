package com.hillel.ahieiev.homework.homework16;

public class PopMusic extends MusicStyles {

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " группа жанра Поп.");
    }
}
