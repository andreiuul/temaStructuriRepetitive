import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {

    public static void main(String[] args) {

       int n = 1234;
       int sum = 0;
       n /= 10;
       while(n != 0){
           sum += n%10;
           n /= 100;
       }
        System.out.println(sum);
    }
}
