import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int count=0;
        while (n>=k){
            n-=k;
            count++;
        }
        System.out.println("qoldiq "+n);
        System.out.println("butun "+count);
    }
}
