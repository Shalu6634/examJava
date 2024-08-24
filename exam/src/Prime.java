import java.util.Scanner;

public class Prime {

//WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.
public static void main(String[] args) {
    Scanner scanner = new  Scanner(System.in);
    int size = scanner.nextInt();
    int[] array = new int[size];

    int a=0;
    for(int i=0; i<array.length; i++)
    {
        for(int j=i+1; j<array.length; j++)
        {
            if(array[i]>array[j])
            {
                a = array[i];

            }

        }
    }


}
}
