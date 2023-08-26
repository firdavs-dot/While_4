import java.util.Scanner;

public class if24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x=input.nextDouble();

        if (x>0){
          double  y=2*Math.sin(x);
            System.out.println(y);
        }else if (x<=0){
          double  y=x-6;
            System.out.println(y);
        }
    }
}
