import java.util.Scanner;
public class for5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for (double i=0.1; i<=1; i+=0.1){
            System.out.println(n*i);
        }
    }
}
