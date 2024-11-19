package a3;
import java.util.*;

//Andrew Shepetchuk

public class a33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ARRAY_SIZE = 8; //change to 7 for second bit of the thingie
        int[] numbers = new int[ARRAY_SIZE];
        

        // Input validation to ensure only positive integers are accepted
        System.out.println("Enter " + ARRAY_SIZE + " positive integers:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            while (true) {
                System.out.print("Enter positive integer for position " + (i + 1) + ": ");
                int in = input.nextInt();
                if (in > 0) {
                    numbers[i] = in;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                }
            }
        }

        // Find the indices of the maximum and minimum elements
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < ARRAY_SIZE; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the maximum and minimum elements
        int temp = numbers[maxIndex];
        numbers[maxIndex] = numbers[minIndex];
        numbers[minIndex] = temp;

        System.out.println("Array after swapping max and min: " + Arrays.toString(numbers));

        // Sort the array to calculate the median
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Calculate the median
        double median;
        if (ARRAY_SIZE % 2 == 0) {
            median = (numbers[ARRAY_SIZE / 2 - 1] + numbers[ARRAY_SIZE / 2]) / 2.0;
        } else {
            median = numbers[ARRAY_SIZE / 2];
        }

        System.out.println("Median of the array: " + median);
    }

}
