import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int summa;
        for(int i=1; i<=10;i++){
            summa=n*i;
            System.out.println(summa);
        }

    }
}
