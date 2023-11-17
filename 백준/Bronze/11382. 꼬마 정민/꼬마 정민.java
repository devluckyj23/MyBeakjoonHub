import java.util.Scanner;

// 77 77 7777  3번 더한다. but int타입보다 숫자가 크기 때문에 Long 타입을 사용해준다.
public class Main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        Long A = s.nextLong();
        Long B = s.nextLong();
        Long C = s.nextLong();
        
        System.out.println(A+B+C);

        s.close();
    }
}
