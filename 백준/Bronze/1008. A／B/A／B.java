import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Double A = s.nextDouble();
        Double B = s.nextDouble();
        System.out.print(A/B);
        s.close();
    }
}