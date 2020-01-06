package com.zadaniaklasyimetody.zadanie3;

import java.util.Random;


public class Zadanie3b {
    public static int rand(int min, int max){


        if(min>max || (max - min +1 > Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Nirprawidłowy zakres.");
        }
        return new Random().nextInt(max - min +1) + min;

        }

    }

