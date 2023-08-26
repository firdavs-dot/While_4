import java.util.Scanner;

public class if25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x=input.nextDouble();
        if (x>2||x<-2){
            double y=2*x;
            System.out.println(y);
        }else{
            double y=-3*x;
            System.out.println(y);
        }






    }
}
