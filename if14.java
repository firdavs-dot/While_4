import java.util.Scanner;

public class if14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>=b&&b>=c&&a>=c){
            System.out.println(c+" "+a);

        }else if(a>=b&&b<=c&&a>=c){
            System.out.println(b+" "+a);

        }else if(a<=c&&b<=c&&a<=b){
            System.out.println(a+" "+c);

        }else if(a<=c&&b>=c&&a<=b){
            System.out.println(a+" "+b);

        }else if(a>=c&&b>=c&&b>=a){
            System.out.println(c+" "+b);

        }else if(a>=b&&c>=b&&c>=a){
            System.out.println(b+" "+c);

        }
    }
}
