import java.util.Scanner;

public class if30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        if(a%2==0&&a>10&&a<100){
            System.out.println("Ikki xonali juft son");
        }else if(a%2!=0&&a>10&&a<100){
            System.out.println("Ikki xonali toq son");
        }else if (a%2==0&&a>100&&a<1000){
            System.out.println("Uch xonali juft son");
        }else if (a%2!=0&&a>100&&a<1000){
            System.out.println("Uch xonali toq son");
        }else if(a>0&&a<10&&a%2==0){
            System.out.println(" Bir xonali juft son");
        }else if(a>0&&a<10&&a%2!=0){
            System.out.println(" Bir xonali toq son");
        }



    }
}
