import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        

        // 0 0 을 입력했을 때 반복문을 멈춰야한다. 이러한 조건을 줄때는 while 문!

        while (true) {
            int A = s.nextInt();
            int B = s.nextInt();

            if(A == 0 && B == 0){
                s.close();
                break;
            }
            else
                System.out.println(A+B);
            
        }
    }
}
    // bufferedReader & StringTokenizer & Stringbuilder 사용해서 풀어보자.

    //     public static void main(String[] args) throws IOException{
                
            
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     StringTokenizer st;
    //     StringBuilder sb = new StringBuilder();

    //     while (true){
    //         st = new StringTokenizer(br.readLine()," ");
    //         int A = Integer.parseInt(st.nextToken());
    //         int B = Integer.parseInt(st.nextToken());

    //         if( A ==0 && B == 0){
    //             break;
    //         }
    //         sb.append((A+B)).append('\n');
    //     }
    //     System.out.println(sb);
    //     }
    // }

