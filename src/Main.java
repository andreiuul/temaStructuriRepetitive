import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {

    public static void main(String[] args) {

        char n = 'S';

        if (n == 'N' || n == 'n' || n == 'S' || n == 's' || n == 'E' || n == 'e' || n == 'W' || n == 'w' || n == 'V' || n == 'v') {
            System.out.println("reprezinta un punct cardinal");
        } else {
            System.out.println("nah bruh");
        }
    }
}
