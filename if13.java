import java.util.Scanner;

public class if13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double max=0;
        double min=0;
        if(a>=b&&b>=c&&a>=c){
            min=c;
            max=a;


        }else if(a>=b&&b<=c&&a>=c){
            min=b;
            max=a;


        }else if(a<=c&&b<=c&&a<=b){
            min=a;
            max=c;


        }else if(a<=c&&b>=c&&a<=b){
            min=a;
            max=b;


        }else if(a>=c&&b>=c&&b>=a){
            min=c;
            max=b;


        }else if(a>=b&&c>=b&&c>=a){
            min=b;
            max=c;


        }
        System.out.println(a+b+c-max-min);
    }
}
