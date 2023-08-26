import java.util.Scanner;

public class if27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        if(x<0){
            int y=0;
            System.out.println(y);
        }else if (x%2==0){
            int y=1;
            System.out.println(y);
        }else if (x%2!=0){
            int y=-1;
            System.out.println(y);
        }



    }
}
