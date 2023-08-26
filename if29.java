import java.util.Scanner;

public class if29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        if(n%4==0&&n%400==0){
            System.out.println("kabisa yili 366 kun bor");
        }else{
            System.out.println("kabisa bo'lmagan yil 365 kun bor");
        }


    }
}
