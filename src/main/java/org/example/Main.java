package org.example;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> result = names.stream()
                .filter(name -> name.contains("a"))
                .toList();
        System.out.println(result);

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        IntStream.range(0, 11)
                .forEach(System.out::println);

    }
}