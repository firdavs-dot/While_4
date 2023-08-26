import java.util.Scanner;

public class case6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,natija=0;
        char b;
        a=input.nextDouble();
        System.out.println("D-detsimetr\n"+"K-kilometr\n"+"M-Metr\n"+"N-Millimetr\n"+"S-Santimetr\n");
        b=input.next().charAt(0);
        switch (b)
        {
            case 'D':
            case 'd': natija=a/10.0;


                break;
            case 'K':
            case 'k':natija=a*1000.0;


                break;
            case 'M':
            case 'm':natija=a;

                break;
            case 'N':
            case 'n':natija=a/1000.0;

                break;
            case 'S':
            case 's':natija=a/100.0;

            break;

            default:
                System.out.println("xato");
        }
        System.out.println("metr="+natija);
    }
}
