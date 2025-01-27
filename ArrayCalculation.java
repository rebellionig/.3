package student.java.homework.weeks.week3_2_1;

public class ArrayCalculation {

    public static void main(String[] args) {
        long startTime = System.nanoTime(); // Start time measurement

        double[] array = new double[100_000_000]; // Create the array

        // Calculate each element
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }

        long endTime = System.nanoTime(); // End time measurement
        long duration = endTime - startTime; // Calculate the duration

        // Convert to milliseconds
        double seconds = duration / 1_000_000_000.0;
        System.out.println("Time taken: " + seconds + " seconds");
    }
}




