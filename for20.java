import java.util.Scanner;

public class for20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int fakt=1;
            for (int j=1;j<=i;j++){
                fakt*=j;
            }
            sum+=fakt;
        }
        System.out.println(sum);
    }
}