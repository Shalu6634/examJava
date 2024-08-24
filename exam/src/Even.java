import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N Number :");
        int value = scanner.nextInt();


        int x=0;
        for(int i=0; i<=value; i++)
        {
            for(int j=i+1; i<=value; i++)
            {
                x = i+j;
            }
        }
        System.out.println("Sum Is:" + x);
    }
}
