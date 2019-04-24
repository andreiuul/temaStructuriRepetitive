import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {

    public static void main(String[] args) {

       int n = 21;
       int m = 22;
       int nInv = 0;

        while(n != 0){
              nInv = n%10 + nInv*10;
              n/=10;
        }
        if(nInv == m){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
