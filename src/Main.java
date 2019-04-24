public class Main {

    public static void main(String[] args) {

        int n = 5;

        //v1
        if(n>=0 && n<=11){
            if(n>=2 && n<=4){
                System.out.println("Primavara");
            }else if(n>=5 && n<=7 ){
                System.out.println("Vara");
            }else if(n >= 8 && n<=10){
                System.out.println("Toamna");
            }else {
                System.out.println("Iarna");
            }

        }else{
            System.out.println("nah bruh");
        }

        //v2
        switch(n){
            case 0:{
                System.out.println("Iarna");
                break;
            }
            case 1:{
                System.out.println("Iarna");
                break;
            }
            case 2:{
                System.out.println("Primavara");
                break;
            }
            case 3:{
                System.out.println("Primavara");
                break;
            }
            case 4:{
                System.out.println("Primavara");
                break;
            }
            case 5:{
                System.out.println("Vara");
                break;
            }
            case 6:{
                System.out.println("Vara");
                break;
            }
            case 7:{
                System.out.println("Vara");
                break;
            }
            case 8:{
                System.out.println("Toamna");
                break;
            }
            case 9: {
                System.out.println("Toamna");
                break;
            }
            case 10: {
                System.out.println("Toamna");
                break;
            }
            case 11: {
                System.out.println("Iarna");
                break;
            }
            default:{
                System.out.println("nah bruh");
            }
        }
    }
}
