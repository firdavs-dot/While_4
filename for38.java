import java.util.Scanner;

public class for38 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            double d=Math.pow(n,n-i);
            sum+=d;
        }
        System.out.println(sum);
    }
}
