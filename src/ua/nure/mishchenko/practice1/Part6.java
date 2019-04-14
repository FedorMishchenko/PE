package ua.nure.mishchenko.practice1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Part6 {
    public static void main(String[] args) {
        for(int i:fillArrayByPrimeNumbers(args)) System.out.printf("%-3d",i);
    }
    private static int[] fillArrayByPrimeNumbers(String...source){
        return IntStream.of(Stream.iterate(3, x -> x + 1)
                .mapToInt(x -> x)
                .limit(Integer.parseInt(source[0]))
                .toArray())
                .filter(Part6::isPrimeNumber)
                .sorted().distinct()
                .toArray();

    }
    private static boolean isPrimeNumber(int number) {
        final double numberSquareRoot = Math.sqrt(number);
        for (int i = 3; i <= numberSquareRoot; i += 2) {
            if (number % i == 0)
                return false;
        }
        return number % 2 != 0;
    }
}
