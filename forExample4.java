import java.util.Scanner;

public class forExample4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n =input.nextInt();


        for (int i = 1; i <= n; i++) {
            if (mukammalSon(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean  mukammalSon (int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
         return sum == n;

    }
}

