import java.util.Scanner;

public class case12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the element (1-4): ");
        int elementNumber = scanner.nextInt();
        double radius, diameter, circumference, area;

        switch (elementNumber) {
            case 1:
                System.out.print("Enter the value of radius (R): ");
                radius = scanner.nextDouble();
                diameter = 2 * radius;
                circumference = 2 * Math.PI * radius;
                area = Math.PI * radius * radius;
                System.out.println("Diameter (D) = " + diameter);
                System.out.println("Circumference (L) = " + circumference);
                System.out.println("Area (S) = " + area);
                break;
            case 2:
                System.out.print("Enter the value of diameter (D): ");
                diameter = scanner.nextDouble();
                radius = diameter / 2;
                circumference = 2 * Math.PI * radius;
                area = Math.PI * radius * radius;
                System.out.println("Radius (R) = " + radius);
                System.out.println("Circumference (L) = " + circumference);
                System.out.println("Area (S) = " + area);
                break;
            case 3:
                System.out.print("Enter the value of circumference (L): ");
                circumference = scanner.nextDouble();
                radius = circumference / (2 * Math.PI);
                diameter = 2 * radius;
                area = Math.PI * radius * radius;
                System.out.println("Radius (R) = " + radius);
                System.out.println("Diameter (D) = " + diameter);
                System.out.println("Area (S) = " + area);
                break;
            case 4:
                System.out.print("Enter the value of area (S): ");
                area = scanner.nextDouble();
                radius = Math.sqrt(area / Math.PI);
                diameter = 2 * radius;
                circumference = 2 * Math.PI * radius;
                System.out.println("Radius (R) = " + radius);
                System.out.println("Diameter (D) = " + diameter);
                System.out.println("Circumference (L) = " + circumference);
                break;
            default:
                System.out.println("Invalid element number. Please enter a number between 1 and 4.");
        }
    }
}

