import java.util.Scanner;

public class for26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        double x=input.nextDouble();
        double sum=0;
        for (int i=0;i<=n;i++){
            sum+=Math.pow(-1,i)*Math.pow(x,(2*i+1))/2*i+1;
        }
        System.out.println(sum);
    }
}
