import java.util.Scanner;

public class case17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" (20-69): ");
        int age = scanner.nextInt();

        String ageWords = "";

        if (age >= 10 && age <= 40) {
            int tensDigit = age / 10;
            int onesDigit = age % 10;

            switch (tensDigit) {
                case 1:
                    ageWords+="o'n";
                    break;
                case 2:
                    ageWords += "yigirma ";
                    break;
                case 3:
                    ageWords += "o'ttiz ";
                    break;
                case 4:
                    ageWords += "qirq ";
                    break;

            }

            if (tensDigit != 0 && onesDigit != 0) {
                ageWords += " ";
            }

            switch (onesDigit) {
                case 1:
                    ageWords += "bir";
                    break;
                case 2:
                    ageWords += "ikki";
                    break;
                case 3:
                    ageWords += "uch";
                    break;
                case 4:
                    ageWords += "to'rt";
                    break;
                case 5:
                    ageWords += "besh";
                    break;
                case 6:
                    ageWords += "olti";
                    break;
                case 7:
                    ageWords += "yetti";
                    break;
                case 8:
                    ageWords += "sakkiz";
                    break;
                case 9:
                    ageWords += "to'qqiz";
                    break;
            }

            ageWords += "ta masala";
            System.out.println("Age words: " + ageWords);
        } else {
            System.out.println("Invalid input. Please enter an age between 20 and 69.");
        }
    }
}


