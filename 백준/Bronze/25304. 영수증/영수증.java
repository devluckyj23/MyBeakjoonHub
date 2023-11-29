import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 총 금액  X
        // 구매한 물건의 종류의 수 N
        // 물건 가격 a
        // 물건 개수 b
        // (개별) 물건 가격 a * 물건 개수 b = sum
        int X = s.nextInt();
        int N = s.nextInt();
        //int sum = 0;
        
        for(int i = 1; i <= N; i++){
            int a = s.nextInt();
            int b = s.nextInt();
             X = X -(a*b);
            // sum += (a*b);
        } 
        if( X == 0){ // 0 or sum
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        s.close();
    

    }
}