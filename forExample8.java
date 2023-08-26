import java.util.Scanner;

public class forExample8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        for (int a = 1; a <=n ; a++) {
            for (int b = a; b <=n ; b++) {
                for (int c = b; c <=n ; c++) {
                    if(a*a+b*b==c*c){
                        System.out.println(a+" "+b+" "+c);
                    }

                }
            }

        }
    }
}