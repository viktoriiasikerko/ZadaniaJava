package com.interfejsy;

public class Main {
    public static void main(String[] args) {
        Beben beben = new Beben();
        Gitara gitara = new Gitara();
        Pianino pianino = new Pianino();

        Instrumentalny[] instrumenty = new Instrumentalny[3];

        for (int i = 0; i < instrumenty.length; i++) {
            instrumenty[i].graj();
        }
    }
}
