import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       int N = s.nextInt();
       int d = N/4;
       for(int i = 0; i < d; i++){ // d 만큼 돌린다. (N/4 만큼)
        System.out.print("long ");
       }
       System.out.println("int");
    }
    //4의 배수가 나올때마다 long을 출력하면 되는데, N을 4로 나눠서 d를 구하고 그 크기만큼 for문을 돌리면 된다.
}
