import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int count=0;
        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count);
    }
}
