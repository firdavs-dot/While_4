import java.util.Scanner;

public class for19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int fakt=1;
        for(int i=1;i<=n;i++)
        {
            fakt*=i;
        }
        System.out.println(fakt);
    }
}
