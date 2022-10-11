package com.hillel.khakhaliev.homeworks.homework13;

public class Main {
    public static void main(String[] args) {
        //POP
        PopMusic PopGroup1 = new PopMusic("pop one");
        PopMusic PopGroup2 = new PopMusic("pop two");
        //ROCK
        RockMusic RockGroup1 = new RockMusic("rock one");
        RockMusic RockGroup2 = new RockMusic("rock two");
        //CLASSIC
        ClassicMusic ClassicGroup1 = new ClassicMusic("classic one");
        ClassicMusic ClassicGroup2 = new ClassicMusic("classic two");
        //GROUP
        MusicStyles[] MusicList = {PopGroup1, PopGroup2, RockGroup1, RockGroup2, ClassicGroup1, ClassicGroup2};
        for (MusicStyles i : MusicList) {
            i.playMusic();
        }
    }
}
