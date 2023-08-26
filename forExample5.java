import java.util.Scanner;

public class forExample5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        for (int i = 1; i <=n ; i++) {
            if(i%3==0&&i%5!=0){
                System.out.println(i);
            }
        }
    }
}
