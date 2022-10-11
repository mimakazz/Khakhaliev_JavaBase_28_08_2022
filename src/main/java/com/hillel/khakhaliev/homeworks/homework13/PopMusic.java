package com.hillel.khakhaliev.homeworks.homework13;

public class PopMusic extends MusicStyles {
    public PopMusic(String genres) {
        super(genres);
        this.genres = genres;
    }

    @Override
    public void playMusic(){
        System.out.println(genres + " plays pop music...");
    }
}
