import java.util.Scanner;

public class for37 {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int  n=input.nextInt();
        int sum=0;
        for ( int i=1;i<=n;i++){
            double g=Math.pow(i,i);
            sum+=g;

        }
        System.out.println(sum);
    }
}
