import java.util.Scanner;

public class forExample10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int result=0;
        for (int i = 1; i <=n; i++) {
            result+=2*n-1;


        }
        System.out.println(result);
    }
}
