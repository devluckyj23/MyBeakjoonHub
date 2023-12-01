import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        //readLine() 시마다 예외처리가 반드시 필요하다.try/catch문으로 감싸주어도 되고, public static void main(String args[]) 옆에 throws IOEcxeption을 통해 예외처리를해도 된다.
        
        // Scaner()메서드는 구동 시간이 길기 때문에, 더 빠르게 결과를 내보내는 BufferedReader()를 사용해서 결과를 내보내야한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 선언
 
		int N = Integer.parseInt(br.readLine());
        // 입력은 readLine(); 메서드를 사용하는데, String으로 리턴 값이 고정 되어 있기 때문에 다른 타입으로 입력을받고자 한다면 반드시 형변환이 필요하다.
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
            
			st = new StringTokenizer(br.readLine()," ");
            //StringTokenizer은 BufferedReader를 통해 읽어온 데이터는 Line 단위로 나누어 진다. 
            //이를 공백 단위로데이터를 가공하고자 하면 따로 작업을 해주어야 한다.

			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
            //StringTokenizer의 nextToken() 함수를 쓰면 readLine()을 통해 입력 받은 값을 공백 단위로 구분하여 순서대로 호출할 수 있다.
		}
		br.close();
        
		bw.flush();
		bw.close();
 
        /* BufferedWriter의 경우 writing을 끝낸 후 적절하게 close()를 해주지 않는다면 정상적으로 writing이 되지 않는 경우가 많다.
        close()를 해주어야 한다고 명시한 이유는, 자원 관리의 중요성 때문이다.
        자바에서는 자원관리를 쉽게 해주는 Garbage Collector가 있기 때문에 큰문제가 되지 않을 수 있다. 
        Native언어의 경우 자원관리를 프로그래머가 직접 해야하는 경우가 많기 때문에, 자원관리를 해주는 습관을 들이는 것이 좋다. */
	}
}