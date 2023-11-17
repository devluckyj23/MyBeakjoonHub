import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();

        System.out.println(A*(B%10)); // a* b의 일의자리
        System.out.println(A*((B/10)%10)); // a* b의 십의자리
        System.out.println(A*(B/100)); // a* b의 백의자리
        System.out.println(A*B); // a* b
        s.close();
    }
}