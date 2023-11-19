import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ly = s.nextInt();
        
    if(ly >0 && ly <= 4000){

        if(ly%4 == 0 && ly%100 != 0 || ly%400 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }    
    }else{
        System.out.println("4000이하의 값을 입력하시오.");
    }
}
}