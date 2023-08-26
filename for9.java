import java.util.Scanner;

public class for9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int result=0;
        int sum=0;
        for (int i=a;i<=b;i++)
            result=i*i;
        sum+=result;
        {
            System.out.println(sum);
        }






    }
}