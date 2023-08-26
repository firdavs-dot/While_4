import java.util.Scanner;
public class forExample7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 2; i <= N; i++) {
            boolean tubson = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                 tubson = false;
                    break;
                }
            }

            if (tubson) {
                System.out.println(i);
            }
        }
    }
}
