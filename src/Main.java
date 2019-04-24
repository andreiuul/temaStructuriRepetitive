import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {

    public static void main(String[] args) {

       int n = 1234;
       int m = 0;
       int sumPar = 0;
       int sumImpar = 0;
       int position = 0;

       while(n != 0){
           if(position % 2 == 0) {
               m += n % 10;
           }else {
               m -= n % 10;
           }
           n /= 10;
           position++;
       }
        System.out.println(m);
    }
}
