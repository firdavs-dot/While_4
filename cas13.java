import java.util.Scanner;

public class cas13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the element (1-4): ");
        int elementNumber = scanner.nextInt();
        double katet,gipotenuza,balandlik,yuza;

        switch (elementNumber)
        {
            case  1:
                System.out.println("katet (a): ");
                katet=scanner.nextDouble();
                gipotenuza=katet*Math.sqrt(2);
                balandlik=gipotenuza/2;
                yuza=gipotenuza*balandlik/2;
                System.out.println("katet (a)=" +katet);
                System.out.println("gipotenuza (c)=" +gipotenuza);
                System.out.println(" balandlik (h)="+balandlik);
                System.out.println("yuza (S)="+yuza);
                break;
            case 2:
                System.out.println("gipotenuza (c): ");
                gipotenuza=scanner.nextDouble();
                katet=gipotenuza/(Math.sqrt(2));
                balandlik=gipotenuza/2;
                yuza=gipotenuza*balandlik/2;
                System.out.println("katet (a)=" +katet);
                System.out.println("gipotenuza (c)=" +gipotenuza);
                System.out.println(" balandlik (h)="+balandlik);
                System.out.println("yuza (S)="+yuza);
                break;
            case 3:
                System.out.println("balandlik (h) : ");
                balandlik=scanner.nextDouble();
                gipotenuza=balandlik*2;
                katet=gipotenuza/(Math.sqrt(2));
                yuza=gipotenuza*balandlik/2;
                System.out.println("katet (a)=" +katet);
                System.out.println("gipotenuza (c)=" +gipotenuza);
                System.out.println(" balandlik (h)="+balandlik);
                System.out.println("yuza (S)="+yuza);
                break;
            case 4:
                System.out.println("yuza (S) : ");
                yuza=scanner.nextDouble();
                gipotenuza=Math.sqrt(4*yuza);
                katet=gipotenuza/(Math.sqrt(2));
                balandlik=gipotenuza/2;
                System.out.println("katet (a)=" +katet);
                System.out.println("gipotenuza (c)=" +gipotenuza);
                System.out.println(" balandlik (h)="+balandlik);
                System.out.println("yuza (S)="+yuza);
                break;
            default:
                System.out.println("Invalid element number. Please enter a number between 1 and 4.");

        }
    }
}
