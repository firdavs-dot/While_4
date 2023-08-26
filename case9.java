import java.util.Scanner;

public class case9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        char y;
        //int k=input.nextInt();
        System.out.println("s-shimol\n" + "j-janub\n" + "q-sharq\n" + "g-g'arb");
        y = input.next().charAt(0);
        switch (y) {
            case 0:
            case 's':
                System.out.println("s");
                break;
            case 'j':
                System.out.println("j");
                break;
            case 'q':
                System.out.println("q");
                break;
            case 'g':
                System.out.println("g");
                break;
        }


        switch (y) {
            case 1:
                switch (y) {
                    case 's':
                        System.out.println("g'");
                        break;
                    case 'j':
                        System.out.println("q");
                        break;
                    case 'q':
                        System.out.println("s");
                        break;
                    case 'g':
                        System.out.println("j");
                        break;
                }
                switch (y) {
                    case 2:
                        switch (y) {
                            case 's':
                                System.out.println("q");
                                break;
                            case 'j':
                                System.out.println("g");
                                break;
                            case 'q':
                                System.out.println("j");
                                break;
                            case 'g':
                                System.out.println("s");
                                break;
                        }
                }


        }
    }
}