import java.util.Scanner;

public class Even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N Number :");
        int size = scanner.nextInt();


          int i;
        int sum=0;
        for(int i=0; i<=size; i++)
        {
            for(int j=i+1; i<=size; i++)
            {

                if(i%2==0)
                {
                    sum=sum+i;
                }

            }
        }
        System.out.println("Sum is:" + sum);
    }
}






