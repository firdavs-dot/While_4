import java.util.Scanner;

public class if20{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        a = input.nextDouble();
        b = input.nextDouble();
        c =  input.nextDouble();
        if(Math.abs(b-a)<Math.abs(c-a)) System.out.println(b + " " + Math.abs(b-a));
        else System.out.println(c + " " + Math.abs(c-a));
    }
}

