// Import the required package

import java.util.Random;

// Create a class

public class Program

{

    // Define main() function

    public static void main(String[] args)

    {

        // Declare array

        int[] data = new int[10];

        // Create constructor

        Random generator = new Random();

        // Execute for loop

        for (int i = 0; i < 10; i++)

        {

            data[i] = generator.nextInt(100) + 1;

        }

        // Printing even indices

        // Execute for loop

        for (int i = 0; i < data.length; i = i + 2)

        {

            // Print the statement

            System.out.print(data[i] + " ");

        }

        // Print the statement

        System.out.println();

        // Printing even elements

        // Execute for loop

        for (int i = 0; i < data.length; i++)

        {

            // Execute if condition

            if (data[i] % 2 == 0)

            {

                // Print the statement

                System.out.print(data[i] + " ");

            }

        }

        // Print the statement

        System.out.println();

        // Printing elements in reverse order

        // Execute for loop

        for (int i = data.length - 1; i >= 0; i--)

        {

            // Print the statement

            System.out.print(data[i] + " ");

        }

        // Print the statement

        System.out.println();

        // Printing first and last elements

        System.out.printf("%d %d\n", data[0], data[data.length - 1]);

    }

}







