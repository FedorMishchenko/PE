package ua.nure.mishchenko.practice1;

import java.util.stream.Stream;

public class Part4 {
    public static void main(String[] args) {
        System.out.printf("%n%d%n", findGreatestCommonDivisor(args));
    }

    private static int findGreatestCommonDivisor(int value1, int value2) {
        while (value2 != 0) {
            int temp = value2;
            value2 = value1 % value2;
            value1 = temp;
        }
        return value1;
    }

    private static int findGreatestCommonDivisor(String... param) {
        int[] numbers = Stream.of(param)
                .mapToInt(Integer::valueOf)
                .filter(x -> x > 0)
                .toArray();
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findGreatestCommonDivisor(result, numbers[i]);
        }
        return result;
    }

}
