import java.util.Scanner;

public class if16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a<b&&b<c&&a<c){
            a*=2;
            b*=2;
            c*=2;
           }else{
            a=-a;
            b=-b;
            c=-c;
        }
        System.out.println(a+" "+b+" "+c);

    }
}
