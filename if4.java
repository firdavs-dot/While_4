import java.util.Scanner;

public class if4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int number = 0;
        number += a > 0 ? 1 : 0;
        number += b > 0 ? 1 : 0;
        number += c> 0 ? 1 : 0;
        System.out.println(number);
    }
}
