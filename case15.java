import java.util.Scanner;

public class case15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the card value (6-14): ");
        int cardValue = scanner.nextInt();

        System.out.println("Enter the card type (1-4): ");
        int cardType = scanner.nextInt();

        String cardName = " ";

        switch (cardValue) {
            case 6:
                cardName = "olti ";
                break;
            case 7:
                cardName = "yetti ";
                break;
            case 8:
                cardName = "sakkiz ";
                break;
            case 9:
                cardName = "to'qqiz ";
                break;
            case 10:
                cardName = "o'n ";
                break;
            case 11:
                cardName = "Valet ";
                break;
            case 12:
                cardName = "Dama ";
                break;
            case 13:
                cardName = "Karol ";
                break;
            case 14:
                cardName = "Tuz ";
                break;
            default:
                System.out.println("Invalid card value. Please enter a value between 6 and 14.");
               // return;
        }

        switch (cardType) {
            case 1:
                cardName += "g'isht";
                break;
            case 2:
                cardName += "olma";
                break;
            case 3:
                cardName += "chillak";
                break;
            case 4:
                cardName += "qarg'a";
                break;
            default:
                System.out.println("Invalid card type. Please enter a value between 1 and 4.");
             //   return;
        }

        System.out.println("Card name: " + cardName);
    }
}
