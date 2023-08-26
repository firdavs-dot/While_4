import java.util.Scanner;

public class case14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the element (1-4): ");
        int elementNumber = scanner.nextInt();
        double tomon, radius1, radius2, yuza;

        switch (elementNumber) {
            case 1:
                System.out.println("tomon (a): ");
                tomon=scanner.nextDouble();
                radius1=tomon*Math.sqrt(3)/6;
                radius2=2*radius1;
                yuza=Math.pow(tomon,2)*Math.sqrt(3)/4;
                System.out.println("tomon (a) =" +tomon);
                System.out.println("radius1 (r) =" +radius1);
                System.out.println("radius2 (R) =" + radius2);
                System.out.println("yuza (S) =" +yuza);
                break;
            case 2:
                System.out.println("radius1 (r) :");
                radius1=scanner.nextDouble();
                tomon=radius1*6/Math.sqrt(3);
                radius2=2*radius1;
                yuza=Math.pow(tomon,2)*Math.sqrt(3)/4;
                System.out.println("tomon (a) =" +tomon);
                System.out.println("radius1 (r) =" +radius1);
                System.out.println("radius2 (R) =" + radius2);
                System.out.println("yuza (S) =" +yuza);
                break;
            case 3:
                System.out.println("radius2 (R) :");
                radius2=scanner.nextDouble();
                radius1=radius2/2;
                tomon=radius1*6/Math.sqrt(3);
                yuza=Math.pow(tomon,2)*Math.sqrt(3)/4;
                System.out.println("tomon (a) =" +tomon);
                System.out.println("radius1 (r) =" +radius1);
                System.out.println("radius2 (R) =" + radius2);
                System.out.println("yuza (S) =" +yuza);
                break;
            case 4:
                System.out.println("yuza (S) : ");
                yuza=scanner.nextDouble();
                tomon=Math.sqrt(4*yuza/Math.sqrt(3));
                radius1=tomon*Math.sqrt(3)/6;
                radius2=2*radius1;
                System.out.println("tomon (a) =" +tomon);
                System.out.println("radius1 (r) =" +radius1);
                System.out.println("radius2 (R) =" + radius2);
                System.out.println("yuza (S) =" +yuza);
                break;
        }
    }
}
