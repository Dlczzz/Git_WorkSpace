package com.git;

import java.util.ArrayList;
import java.util.List;


public class HelloGit {
    public static void main(String[] args) {
        System.out.println("hello Git!");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(System.out::println);
    }
}
