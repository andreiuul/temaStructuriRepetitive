import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {

    public static void main(String[] args) {

        long n = 2960223326598L;

        n /= 1000000;
        int zi = (int)n%100;
        int luna = ((int)n/100) % 100;
        int an = ((int)n/10000) % 100;
        int sex = (int)n/1000000;
        switch(sex){
            case 1:
            case 3:
            case 5:
            case 7:
                {
                System.out.print("baiat nascut ");
                break;
            }
            case 2:
            case 4:
            case 6:
            case 8:
                {
                System.out.print("fata nascuta ");
                break;
            }
            default:{
                System.out.println("numar sex invalid ");
            }
        }

        if(zi>0 && zi < 32){
            System.out.print("pe "+ zi+" ");
        }

        switch(luna){
            case 1: {
                System.out.print("ianuarie ");
                break;
            }
            case 2: {
                System.out.print("februarie ");
                break;
            }
            case 3: {
                System.out.print("martie ");
                break;
            }
            case 4: {
                System.out.print("aprilie ");
                break;
            }
            case 5: {
                System.out.print("mai ");
                break;
            }
            case 6: {
                System.out.print("iunie ");
                break;
            }
            case 7: {
                System.out.print("iulie ");
                break;
            }
            case 8: {
                System.out.print("august ");
                break;
            }
            case 9: {
                System.out.print("septembrie ");
                break;
            }
            case 10: {
                System.out.print("octombrie ");
                break;
            }
            case 11: {
                System.out.print("noiembrie ");
                break;
            }
            case 12: {
                System.out.print("decembrie ");
                break;
            }
        }
        if(sex<3 || sex >6) {
            System.out.print("19" + an);
        }else if(sex<5){
            System.out.print("18" + an);
        }else if(sex<7){
            System.out.print("20" + an);
        }
    }
}
