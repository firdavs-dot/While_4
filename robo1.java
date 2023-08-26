import java.util.Scanner;

public class robo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a");
        int a=input.nextInt();
        System.out.println("b");

        int b=input.nextInt();
        if(a>b){
            System.out.println(">");
        }else if(a<b){
            System.out.println("<");
        }else if(a==b){
            System.out.println("=");
        }
    }
}
