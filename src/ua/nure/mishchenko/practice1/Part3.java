package ua.nure.mishchenko.practice1;

public class Part3 {
    public static void main(String[] args) {
       StringBuilder sb =  new StringBuilder(" ");
        for (String arg : args) {
            sb.append(arg);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
