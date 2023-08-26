import java.util.Scanner;

public class case20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        String hayvon_nomi = " ";
       String hayvon_rangi=" ";


            switch (((n+1984)%60+5)%12) {
                case 1:
                    hayvon_nomi += "sichqon";
                    break;
                case 2 :
                    hayvon_nomi += "sigir";
                    break;
                    case 3:
                        hayvon_nomi += "yo'lbars";
                        break;
                case 4:
                    hayvon_nomi += "quyon";
                    break;
                case 5:
                    hayvon_nomi += "ajdar";
                    break;
                case 6:
                    hayvon_nomi += "ilon";
                    break;
                case 7:
                    hayvon_nomi += "ot";
                    break;
                case 8:
                    hayvon_nomi += "qo'y";
                    break;
                case 9:
                    hayvon_nomi += "maymun";
                    break;
                case 10:
                    hayvon_nomi += "tovuq";
                    break;
                case 11:
                    hayvon_nomi += "it";
                    break;
                case 12:
                    hayvon_nomi += "to'ng'iz";
                    break;




                }


        switch (((n + 1984) % 60 + 5) / 12) {
            case 1:
                hayvon_rangi = "yashil";
                break;
            case 2:
                hayvon_rangi = "qizil";
                break;
            case 3:
                hayvon_rangi = "sariq";
                break;
            case 4:
                hayvon_rangi = "oq";
                break;
            case 5:
                hayvon_rangi = "qora";
                break;

        }
        System.out.println(hayvon_rangi + hayvon_nomi);
            }



    }
