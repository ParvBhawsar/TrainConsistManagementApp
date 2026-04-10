import java.util.Arrays;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 19: Binary Search for Bogie ID
 *
 * @author Developer
 * @version 19.0
 */

public class TrainConsistManagementApp {

    // Reusable method for binary search + tests
    public static boolean binarySearch(String[] bogieIds, String target) {
        Arrays.sort(bogieIds); // ensure sorted input

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = bogieIds[mid].compareTo(target);

            if (compare == 0) {
                return true;
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==================================================\n");

        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG205";

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieIds));

        boolean found = binarySearch(bogieIds, searchKey);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.println("\nSearching for: " + searchKey);
        System.out.println("Bogie Found? " + found);

        System.out.println("\nUC19 binary search completed...");
    }
}