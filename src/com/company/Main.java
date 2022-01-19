package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<String> list = Arrays.asList("samma", "bar", "candy", "drool", "cheese", "orange", "dragon", "doom", "drum", "car");
        List<String> list2;

        Pattern pattern = Pattern.compile("[aeiouy][^ ]*[aeiouy]");
        list2 = list.stream()
                .filter(s -> pattern.matcher(s).find()).toList();
        System.out.println(list2);
    }
}
