package com.hillel.khakhaliev.homeworks.homework13;

public class RockMusic extends MusicStyles{
    public RockMusic(String genres) {
        super(genres);
        this.genres = genres;
    }
    @Override
    public void playMusic(){
        System.out.println(genres + " plays rock music...");
    }
}
