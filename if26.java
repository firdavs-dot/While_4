import java.util.Scanner;

public class if26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double x=input.nextDouble();
       if (x<=0){
           double y=-x;
           System.out.println(y);
       }else if(0<x&&x<2){
           double y=Math.pow(x,2);
           System.out.println(y);
       }else if (x>=2){
           double y=4;
           System.out.println(y);
       }
    }
}
