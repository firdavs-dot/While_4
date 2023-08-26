import java.util.Scanner;

public class case3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k=input.nextInt();
        switch (k)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("qish");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("bahor");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yoz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("kuz");
                break;
            default:
                System.out.println("bunday oy yo'q");
        }
    }
}
