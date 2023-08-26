import java.util.Scanner;

public class for6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(double i=1.2 ; i<=2; i+=0.2){
            System.out.println(n*i);
        }
    }
}
