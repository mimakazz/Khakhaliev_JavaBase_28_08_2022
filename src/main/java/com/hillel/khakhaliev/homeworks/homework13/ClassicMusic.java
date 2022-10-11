package com.hillel.khakhaliev.homeworks.homework13;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String genres) {
        super(genres);

        this.genres = genres;
    }

    @Override
    public void playMusic(){
        System.out.println(genres + " plays classic music...");
    }
}
