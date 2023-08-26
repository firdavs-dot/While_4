import java.util.Scanner;

public class if1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int A= input.nextInt();
        if (A>0)
        {
            System.out.println(A+1);
        }else {
            System.out.println(A);
        }
    }
}
