public class Main {

    public static void main(String[] args) {

        int i;
        int countPar = 0;
        int countImpar = 0;
        int[] vector = new int[]{1,3,5,12,634,32,33,55,23,0,9};
        for(i=0;i<vector.length; i++){
            if(vector[i]%2 == 1){
                countImpar++;
            }else
                countPar++;
        }
            System.out.println("pare " + countPar);

            System.out.println("impare " + countImpar);


    }
}
