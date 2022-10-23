package com.hillel.khakhaliev.homework;


import com.hillel.khakhaliev.homeworks.homework16.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static int[]array;
    @BeforeAll
    public static void beBeforeAll(){
        array=new int[]{5,6,9,8,3,9};
    }
    @Test
    void array1() {
       assertEquals(6.3333, Main.Array(array),0.001);
    }
    @Test
    void array2() {
        assertEquals(-2, Main.Array(null));
    }
    @Test
    void doubleArray1() {
        assertEquals(1,Main.DoubleArray(new int[][]{{1, 2, 3, 7}, {1, 2, 4, 6}, {1, 2, 5, 6,},{1,2,3,4}}));
    }
    @Test
    void doubleArray2() {
        assertEquals(0, Main.DoubleArray(new int[][]{{1, 2, 3}, {1, 2, 4}, {1, 2, 5},{1,2,3}}));
    }
    @Test
    void doubleArray3() {
        assertEquals(-2,Main.DoubleArray(null));
    }


}
