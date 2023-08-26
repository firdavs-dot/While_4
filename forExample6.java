import java.util.Scanner;
public class forExample6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N =input.nextInt();

        boolean tubson = true;

        if (N == 1) {
            tubson = false ;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    tubson = false;
                    break;
                }
            }
        }

        if (tubson) {
            System.out.println(N + " tub son");
        } else {
            System.out.println(N + " tub son emas ");
        }
    }
}

