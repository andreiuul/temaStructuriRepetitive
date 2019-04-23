public class Main {

    public static void main(String[] args) {
        //# ##  ###   ####   ###  ##  #  -cerinta
        //# ##  ###   ####   ###  ##  #  -output
        int i,j;
        int[] vector = new int[]{1, 1, 2, 2, 3, 3, 4, 3, 3, 2, 2, 2, 1};
        for (i = 0; i < vector.length; i++) {
            if (i%2 == 0) {
                for (j = 0; j < vector[i]; j++) {
                    System.out.print("#");
                }
            } else {
                for (j = 0; j < vector[i]; j++) {
                    System.out.print(" ");
                }
            }
        }
    }
}
