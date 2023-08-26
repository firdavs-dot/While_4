import java.util.Scanner;

public class case7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,natija=0;
        char b;
        a=input.nextDouble();
        System.out.println("K-kilogram\n"+"M-milligram\n"+"G-gramm\n"+"T-tonna\n"+"S-sentner\n");
        b=input.next().charAt(0);
        switch (b)
        {
            case'K':
            case 'k':natija=a;
            break;
            case 'M':
            case 'm':natija=a/1000000.0;
            break;
            case 'G':
            case 'g':natija=a/1000.0;
            break;
            case 'T':
            case 't':natija=a*1000.0;
            break;
            case 'S':
            case 's':natija=a*100.0;
            default:
                System.out.println("xato");

        }
        System.out.println(natija);
    }
}
