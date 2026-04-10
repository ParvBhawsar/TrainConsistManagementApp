import java.util.Arrays;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 20: Exception Handling During Search Operations
 *
 * @author Developer
 * @version 20.0
 */

public class TrainConsistManagementApp {

    // Reusable defensive search method
    public static boolean safeSearch(String[] bogieIds, String target) {
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Search cannot be performed: No bogies available in train");
        }

        for (String id : bogieIds) {
            if (id.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("==================================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309"};
        String searchKey = "BG205";

        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        boolean found = safeSearch(bogieIds, searchKey);

        System.out.println("\nSearching for: " + searchKey);
        System.out.println("Bogie Found? " + found);

        System.out.println("\nUC20 defensive search completed...");
    }
}