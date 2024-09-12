import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {
        // 1D Array Example
        System.out.println("1D Array Example:");
        int[] numbers = {5, 3, 8, 1, 2};

        // Accessing and Modifying Elements
        System.out.println("Original Array: " + Arrays.toString(numbers));
        numbers[2] = 10; // Modifying the third element
        System.out.println("Modified Array: " + Arrays.toString(numbers));

        // Iterating Over Array
        System.out.println("Iterating Using For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("Iterating Using For-Each Loop:");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }

        // Sorting and Searching
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        int index = Arrays.binarySearch(numbers, 10);
        System.out.println("Index of 10: " + index);

        // 2D Array Example
        System.out.println("\n2D Array Example:");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing Elements
        int element = matrix[1][2]; // Element at row 1, column 2
        System.out.println("Element at [1][2]: " + element);

        // Iterating Over 2D Array
        System.out.println("Iterating Over 2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
