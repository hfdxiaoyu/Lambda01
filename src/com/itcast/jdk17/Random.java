package com.itcast.jdk17;

import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

/**
 * jdk17 增强伪随机数
 */
public class Random {
    public static void main(String[] args) {
        // 更多随机数类型请看文档
        RandomGenerator g = RandomGenerator.of("L64X128MixRandom");
        System.out.println(g.nextInt());
    }

}
