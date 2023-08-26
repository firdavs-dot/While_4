import java.util.Scanner;

public class if12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>b&&b>c&&a>c){
            System.out.println(c);
        }
    }
}
