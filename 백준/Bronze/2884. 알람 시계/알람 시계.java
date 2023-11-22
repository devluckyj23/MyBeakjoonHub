import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int H = s.nextInt();
        int M = s.nextInt();


        if(0<= H && H <=23 && 0<= M && M <=59){

            if(M < 45){
            H--;
            M = 60-(45-M);

                if(H<0){
                    H = 23;
                }
                System.out.println(H + " " + M);   
            }else{
                System.out.println(H + " " + (M-45));
            }
        }
    }
}
