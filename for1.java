import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k=input.nextInt();
        int n=input.nextInt();
        for (int i=1; i<=n;i++){
            System.out.print("i=" +i+"\t=>\t");
            for(int j=k;j<=k;j++){
                System.out.print(j+ "\t");
            }
            System.out.print("");
        }
    }
}
