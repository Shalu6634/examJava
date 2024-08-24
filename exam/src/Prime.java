import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int sum = 0;
        System.out.print("Enter value: ");
        size = scanner.nextInt();

        for (int i = 1; i < size; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 || i == 2 || i == 3) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of Prime number: " + sum);
    }
}

