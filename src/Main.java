public class Main {

    public static void main(String[] args) {

        int i;
        int n = 7;
        int digits = 2;
        int sum = 0;
        for(i = 0; i < n; i++){
            digits*=3;
        }

        //System.out.println(digits);

        while(digits != 0){
            sum+=(digits%10);
            digits/=10;
        }
        System.out.println(sum);
}
}
