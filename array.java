import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // 1. Declaration and Initialization of an array
        try (Scanner sc = new Scanner(System.in)) {
            // 1. Declaration and Initialization of an array
            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] numbers = new int[size];
            
            // 2. Taking input from the user
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }
            
            // 3. Displaying the array
            System.out.print("Array elements are: ");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            
            // 4. Finding the sum of array elements
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += numbers[i];
            }
            System.out.println("Sum of array elements: " + sum);
            
            // 5. Finding the maximum element
            int max = numbers[0];
            for (int i = 1; i < size; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("Maximum element in the array: " + max);
        }
    }
}
