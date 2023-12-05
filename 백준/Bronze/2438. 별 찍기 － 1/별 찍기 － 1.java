import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        br.close();
        for(int i = 1; i<=t; i++){
            for(int j = 1; j<=i; j++){
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        
    }
}
// Scanner 사용
// import java.util.Scanner;

// public class mma {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int a = s.nextInt();

//         for(int i = 1; i <=a; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         s.close();
    
//     }
// }
