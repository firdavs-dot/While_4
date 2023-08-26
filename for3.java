import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        for (int i=a+1; i<b; i++)
        {
            System.out.println(i);
        }
    }
}
