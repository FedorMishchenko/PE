package ua.nure.mishchenko.practice1;

import java.util.regex.Pattern;

public class Part5 {
    public static void main(String[] args) {
        System.out.printf("%d%n",findSumOfDigitsInNumber(args));
    }
    private static int findSumOfDigitsInNumber(String[] source){
        return Pattern.compile("")
                .splitAsStream(source[0])
                .mapToInt(Integer::valueOf)
                .sum();
    }
}
