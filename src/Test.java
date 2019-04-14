public class Test {
    public static void main(String[] args) {
        String s = "11127";
        for(int i = Integer.parseInt(s); i != 0; i = (i - 1) / 26){
//            System.out.printf("%c",(char)((i - 1) % 26 + 65));
//            System.out.println(String.format("%c",((i - 1) % 26 + 65)));
            System.out.println(((11127 % 26)));
        }
        for(int i = 65; i < 91; i++)
        System.out.printf("%-2c%-2s %-2d%n",(char)i,"==>",i - 64);
    }
}
