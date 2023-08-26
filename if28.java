import java.util.Scanner;

public class if28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        if (x%2==0&&x>0){
            System.out.println("musbat juft son");
        }else if(x%2==0&&x<0){
            System.out.println("manfiy juft son");
        }else if (x%2!=0&&x>0){
            System.out.println("musbat toq son");
        }else if(x%2!=0&&x<0){
            System.out.println("manfiy toq son");
        }else if(x==0){
            System.out.println("son nolga teng");
        }
    }
}
