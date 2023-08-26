import java.util.Scanner;

public class if19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d=input.nextInt();
        if(a!=b&&b!=c&&c!=d&&a!=d){
            System.out.println("yo'q");
        }if(a==b&&b==c){
            System.out.println(d=4);
        } else if (b==c&&c==d) {
            System.out.println(a=1);

        }else if (a==c&&c==d){
            System.out.println(b=2);
        }else if(a==b&&b==d){
            System.out.println(c=3);
        }
    }
}
