import java.util.Arrays;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * @author Developer
 * @version 17.0
 */

public class TrainConsistManagementApp {

    // Reusable method for test cases
    public static void sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames);
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("==================================================\n");

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        sortBogieNames(bogieNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed...");
    }
}