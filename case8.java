import java.util.Scanner;

public class case8 {
    public static void main(String[] args) {

        Scanner day = new Scanner(System.in);
        Scanner month = new Scanner(System.in);


        int dayNumber = day.nextInt();
        int monthNumber = month.nextInt();


        switch (monthNumber)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12 :
               // dayNumber++;
                if(dayNumber >31){
                    monthNumber += 1;
                    System.out.println("Day : 1 Month : " + monthNumber);
                }else{
                    System.out.println("Day : "+ dayNumber + " Month : " + monthNumber);
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
               // dayNumber++;
                if(dayNumber <30 ){
                    monthNumber += 1;
                    System.out.println("Day : 1, Month : " + monthNumber);
                }else{
                    System.out.println("Day : "+ dayNumber + " Month : " + monthNumber);
                }
                break;


            case 2:
               // dayNumber++;
                if ( dayNumber > 28 ) {
                    monthNumber += 1;
                    System.out.println("Day : 1, Month : " + monthNumber);
                } else{
                    System.out.println("Day : "+ dayNumber + " Month : " + monthNumber);
                }
                break;



        }



    }
}






