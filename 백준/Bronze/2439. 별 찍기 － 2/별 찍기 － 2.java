import java.util.Scanner;
public class Main{
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for(int i = 1; i <= t; i++){
            for(int k = 1; k<=t-i; k++){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        s.close();
        }
    }