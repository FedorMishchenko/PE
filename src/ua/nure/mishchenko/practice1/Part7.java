package ua.nure.mishchenko.practice1;

public class Part7 {
    public static void main(String[] args) {
        System.out.println();
        digits2chars(args);
        defineRightColumnByDigit((int) (Math.random() * 100));
        chars2digit("AAA");
    }

    private static void digits2chars(String... param) {
        for (String str : param) {
            int number = Integer.parseInt(str);
            String res = "";
            for (int i = number; i != 0; i = (i - 1) / 26)
                res = String.format("%c%s", ((i - 1) % 26 + 65), res);
            System.out.printf("%-3s%4s%4s%4s%4s%n", res, "==>", number, "==>", res);
        }
    }

    private static int charToInt(char character) {
        return (character - 'A' + 1);
    }

    private static void chars2digit(String param) {
        System.out.printf("%s%n","chars to digits:");
        int result = charToInt(param.charAt(param.length() - 1));
        int row = 1;
        for (int i = param.length() - 2; i >= 0; i--) {
            result += Math.pow(26, row) * charToInt(param.charAt(i));
            row++;
        }
        digits2chars(String.valueOf(result));
        System.out.println();
    }

    private static void defineRightColumnByDigit(int columnNumber) {
        System.out.printf("%n%s%d%n%s%n", "column index = ", columnNumber, "define right column:");
        String[] number = new String[]{String.valueOf(columnNumber + 1)};
        digits2chars(number);
        System.out.println();
    }

}
