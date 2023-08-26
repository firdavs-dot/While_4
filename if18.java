import java.util.Scanner;

public class if18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a!=b&&b!=c&&a!=c){
            System.out.println("yo'q");
        }
        if(a==b){
            System.out.println(c=3);
        } else if (b==c) {
            System.out.println(a=1);

        }else if(a==c){
            System.out.println(b=2);
        }
    }
}
