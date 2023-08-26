import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k=input.nextInt();
        switch (k)
        {
            case 1:
                System.out.println("yomon");
                break;
            case 2:
                System.out.println("qoniqarsiz");
                break;
            case 3:
                System.out.println("qoniqarli");
                break;
            case 4:
                System.out.println("yaxshi");
                break;
            case 5:
                System.out.println("a'lo");
            default:
                System.out.println("xato");
        }
    }
}
