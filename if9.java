import java.util.Scanner;

public class if9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        if (a > b) {
            double temp = a;
            a = b;
            b=temp;

            System.out.println(a + " " + b);
        }else if(a<=b){
            System.out.println(a+" "+b);



        }
    }
}