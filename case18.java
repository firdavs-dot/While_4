import java.util.Scanner;

public class case18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int y=n/100;
        int o=n/10%10;
        int b=n%10;
        switch (y){
            case 1:
                System.out.print("bir yuz " );
                break;
            case 2:
                System.out.print("ikki yuz ");
                break;
            case 3:
                System.out.print("uch yuz ");
                break;
            case 4:
                System.out.print("to'rt yuz ");
                break;
            case 5:
                System.out.print("besh yuz ");
                break;
            case 6:
                System.out.print("olti yuz ");
                break;
            case 7:
                System.out.print("yetti yuz ");
                break;
            case 8:
                System.out.print("sakkiz yuz ");
                break;
            case 9:
                System.out.print("to'qqiz yuz ");
                break;
        }
        switch (o){
            case 1:
                System.out.print("o'n " );
                break;
            case 2:
                System.out.print("yigirma ");
                break;
            case 3:
                System.out.print("o'ttiz ");
                break;
            case 4:
                System.out.print("qirq ");
                break;
            case 5:
                System.out.print("ellik ");
                break;
            case 6:
                System.out.print("oltmish ");
                break;
            case 7:
                System.out.print("yetmish ");
                break;
            case 8:
                System.out.print("sakson ");
                break;
            case 9:
                System.out.print("to'qson ");
                break;
        }
        switch (b){
            case 1:
                System.out.print("bir " );
                break;
            case 2:
                System.out.print("ikki");
                break;
            case 3:
                System.out.print("uch");
                break;
            case 4:
                System.out.print("to'rt");
                break;
            case 5:
                System.out.print("besh");
                break;
            case 6:
                System.out.print("olti");
                break;
            case 7:
                System.out.print("yetti");
                break;
            case 8:
                System.out.print("sakkiz");
                break;
            case 9:
                System.out.print("to'qqiz");
                break;
        }

    }
}
