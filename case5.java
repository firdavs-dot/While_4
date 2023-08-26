import java.util.Scanner;

public class case5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,natija=0;
        char c;
        a=input.nextDouble();
        b=input.nextDouble();
        System.out.println("Arifmetik amalni kiriting\n"+"Q-Qo'shish\n"+"A-Ayirish\n"+"K-Ko'paytirish\n"+"B-Bo'lish");

        c=input.next().charAt(0);
        switch (c)
        {
            case 'Q':
            case 'q':natija=a+b;
                break;
            case 'A':
            case 'a' :natija=a-b;
            break;


            case 'B':
            case 'b':natija=a/b;
                break;
            case 'K':
            case 'k':natija=a*b;
                break;

            default:
                System.out.println("bunday amal yo'q");
        }
        System.out.println(natija);
    }
}
