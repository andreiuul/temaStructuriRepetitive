public class Main {

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        int count = 0;
        int[] numbers = new int[]{2, 5, 55, 64, 8,17, 31, 32, 2, 0, 17, 24};

        while (count < 5){
            if(numbers[i] % 2 == 0) {
                sum += numbers[i];
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
