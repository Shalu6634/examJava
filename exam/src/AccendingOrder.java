
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];


        System.out.println("Enter  elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
       
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n-i-1; j++){
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(" After: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
