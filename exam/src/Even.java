public class Even {
    //WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION.
    public static void main(String[] args) {

        int[] array = {2, 3, 5, 6, 78, 8};


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
