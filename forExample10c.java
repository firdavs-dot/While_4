import java.util.Scanner;

public class forExample10c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double sum=0;
      int  result=1;
        for(double i=1;i<=n;i++){
           result*=2;

           sum=(1/result);
            System.out.println(sum);
        }
    }
}