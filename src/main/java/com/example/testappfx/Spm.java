package com.example.testappfx;

public class Spm {
    private static int c = 0;

    private Spm() {};

    public static void adder() {
        c = c + 1;
    }

    public static int getC() {
        return c;
    }
    public static void setC(int a) {
        c = a;
    }

}
