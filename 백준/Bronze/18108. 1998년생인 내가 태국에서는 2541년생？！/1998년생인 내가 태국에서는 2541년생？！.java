import java.util.Scanner;

public class  Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int bul = s.nextInt();

        int west = bul-543;

        System.out.println(west);
        s.close();
    }
}