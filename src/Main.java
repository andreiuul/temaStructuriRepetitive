public class Main {

    public static void main(String[] args) {

        int n = 5;
        int counter = 1; //aparent in exemplu numarul initial e numerotat ca operatie asa ca m-am conformat

        while (true) {
            if(n == 1){
                break;
            } else if(n%2 == 0){
                n = n/2;
            }else{
                n = 3*n+1;
            }
            counter++;
        }
        System.out.print(counter);
    }
}
