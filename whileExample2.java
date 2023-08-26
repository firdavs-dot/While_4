import java.util.Scanner;

public class whileExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        while (a>b){
            a-=b;
        }
        System.out.println(a);
    }
}
