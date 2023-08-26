import java.util.Scanner;

public class if15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int bir=Math.max(a, Math.max(b,c));
        int ikki;
        if (bir==a){
            ikki=Math.max(b,c);
        } else if (bir==b){
            ikki=Math.max(a,c);

        }else{
            ikki=Math.max(a,b);
        }
        System.out.println(bir+" "+ikki);


    }
    }