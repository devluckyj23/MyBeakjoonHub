import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException { // 예외 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        
        // String s = br.readLine(); // String
        int a = Integer.parseInt(br.readLine()); // int
        
        StringTokenizer st; //공백단위로 나누기위해서..
        for(int i=1; i<= a; i++){
            st = new StringTokenizer(br.readLine(), " "); //" " 공백단위로 나눔
            System.out.println("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
        }
        br.close();

    }
   //- 데이터 가공
        //BufferedReader를 통해 읽어온 데이터는 개행문자 단위(Line 단위)로 나누어진다. 
        //만약 이를 공백 단위로 데이터를 가공하고자 하면 따로 작업을 해주어야 한다. 
        //이때 사용하는 것이 StringTokenizer나 String.split() 함수이다.

        // ============================== 예시 =============
        //    StringTokenizer //
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // int N = Integer.parseInt(st.nextToken());
        // int M = Integer.parseInt(st.nextToken());
        // StringTokenizer의 nextToken() 함수를 쓰면 readLine()을 통해 입력 받은 값을 공백 단위로 구분하여 순서대로 호출할 수 있다.

        // String.split() 함수 //
        // String arr[] = s.split(" ");
        // String.split() 함수를 사용하면, 배열에 공백단위로 끊어 데이터를 저장하여 사용할 수 있다.

}
