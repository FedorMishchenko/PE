package ua.nure.mishchenko.practice1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Part6 {
    private static final int CONST = 3;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i:fillArrayByPrimeNumbers(args)) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
    private static int[] fillArrayByPrimeNumbers(String[] source){
        return IntStream.of(Stream.iterate(2, x -> x + 1)
                .mapToInt(x -> x)
                .filter(Part6::isPrimeNumber)
                .limit(Integer.parseInt(source[0]))
                .toArray()).toArray();

    }
    private static boolean isPrimeNumber(int number) {
        if (number == 2) {
            return true;
        }
        final double numberSquareRoot = Math.sqrt(number);
        for (long i = CONST; i <= numberSquareRoot; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return number % 2 != 0;
    }
}
