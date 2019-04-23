public class Main {

    public static void main(String[] args) {

        int i;
        int max = -1;
        int[] vector = new int[]{1,3,5,12,634,32,33,55,23,0,9};
        for(i=0;i<vector.length; i++){
            if(vector[i] > max && vector[i]%2 == 1){
                max = vector[i];
            }
        }
        if(max == -1){
            System.out.println("no");
        }else
            System.out.println(max);


    }
}
