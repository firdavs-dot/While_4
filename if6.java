import java.util.Scanner;

public class if6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,max;
        a= input.nextInt();
        b= input.nextInt();

        max= a>b ? a:b;

        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
