//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//
//WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

//WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.
//WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION.
//WAP TO CREATE PATTERN AS MENTIONED BELOW IMAGE.

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {2,3,5,6,78,8};

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
        System.out.print("Largest number : ");
        System.out.print(a);

    }
}