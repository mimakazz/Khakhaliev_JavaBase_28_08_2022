package com.hillel.khakhaliev.homeworks.homework15;

public enum DrinksMachine {
    COFFEE("COFFEE"),
    TEA("TEA"),
    LEMONADE("LEMONADE"),
    MOJITO("MOJITO"),
    MINERAL("MINERAL"),
    COCA_COLA("COCA_COLA");
    private final String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
