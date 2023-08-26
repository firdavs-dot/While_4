import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        if(a>0){
            System.out.println(a+1);
        }else {
            System.out.println(a-2);
        }
    }
}
