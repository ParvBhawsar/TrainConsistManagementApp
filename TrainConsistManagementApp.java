import java.util.Arrays;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 18: Linear Search for Bogie ID
 *
 * @author Developer
 * @version 18.0
 */

public class TrainConsistManagementApp {

    // Reusable method for search + test cases
    public static boolean linearSearch(String[] bogieIds, String target) {
        for (String id : bogieIds) {
            if (id.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("==================================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        boolean found = linearSearch(bogieIds, searchKey);

        System.out.println("\nSearching for: " + searchKey);
        System.out.println("Bogie Found? " + found);

        System.out.println("\nUC18 searching completed...");
    }
}