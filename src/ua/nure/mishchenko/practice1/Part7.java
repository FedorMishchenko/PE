package ua.nure.mishchenko.practice1;

public class Part7 {
    private static final String[] DEFAULT_VALUE =
            {"1","2","26","27","52","53","702","703"};
    private static final int NUM_SYSTEM = 26;
    private static final int CONST = 65;
    public static void main(String[] args) {
        if(("EMPTY").equals(args[0])){
            args = DEFAULT_VALUE;
        }
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++){
            numbers[i] = Integer.parseInt(args[i]);
        }
        for (int i: numbers){
            System.out.println(int2str(i) + " ==> " + str2int(int2str(i)) + " ==> " + int2str(i));
        }
    }

    public static String int2str(int number){
        String res = "";
        for (int i = number; i != 0; i = (i - 1) / NUM_SYSTEM) {
            res = String.format("%c%s", ((i - 1) % NUM_SYSTEM + CONST), res);
        }
        return res;
    }

    public static int str2int(String param) {
        int result = ((param.charAt(param.length() - 1)) - 'A' + 1);
        int row = 1;
        for (int i = param.length() - 2; i >= 0; i--) {
            result += Math.pow(NUM_SYSTEM, row) * ((param.charAt(i)) - 'A' + 1);
            row++;
        }
        return result;
    }

    public static String rightColumn(String param) {
        int result = str2int(param);
        return int2str(++result);
    }

}
