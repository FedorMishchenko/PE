package ua.nure.mishchenko.practice1;

import java.util.stream.Stream;

public class Part3 {
    public static void main(String[] args) {
        Stream.of(args)
                .forEach(x -> System.out.printf("%s ",x));
    }
}
