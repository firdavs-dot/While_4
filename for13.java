import java.util.Scanner;

public class for13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int sum1=0;
        int sum2=0;
        for (double i=1.1; i<=n;i+=0.2)
            sum1+=i;
        for (double j=1.2;j<=n;j+=0.2)
            sum2+=j;
        {
            System.out.println(sum1-sum2);
        }
    }
}
