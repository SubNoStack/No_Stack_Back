package com.stone.microstone.util;

import java.util.Random;

public class RandomNumberGeneration {
    public static final String makeRandomNumber() {
        Random random = new Random();
        return String.valueOf(100000 + random.nextInt(900000));
    }
}
