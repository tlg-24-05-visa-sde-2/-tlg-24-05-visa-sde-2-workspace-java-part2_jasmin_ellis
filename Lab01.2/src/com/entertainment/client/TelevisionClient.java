package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tvA = new Television("RCA", 10);
        Television tvB = new Television("RCA", 10);

        System.out.println(tvA);
        System.out.println(tvB);

        tvA.changeChannel(33);
        System.out.println(tvB);
    }

}