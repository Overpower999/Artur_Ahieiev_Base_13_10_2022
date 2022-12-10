package com.hillel.ahieiev.homework.homework16;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(getName() + " группа жанра Класика.");

    }
}
