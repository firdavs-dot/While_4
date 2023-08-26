import java.util.Scanner;

public class if10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        if (a!=b){
             a+=b;
             b=a;
        } else {
            a=0;
            b=0;
        }
        System.out.println(a+" "+b);





    }
}
