import java.util.Scanner;

public class for8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int result=1;
        for(int i=a;i<=b;i++)
            result*=i;
        {
            System.out.println(result);
        }
    }
}