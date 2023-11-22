import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int H = s.nextInt();
        int M = s.nextInt();
        int add = s.nextInt(); // 조리시간

        int min = 60* H + M; // 시 => 분 ( 17시 40 분 == 1060분 )
        min = min+add; // min +=add;

        int cook_h = (min/60) % 24; //시간
        int cook_m = min%60; // 분
        System.out.println( cook_h + " " + cook_m);
        s.close();
    }
}