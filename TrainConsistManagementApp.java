import java.util.HashSet;
import java.util.Set;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * @author Developer
 * @version 3.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("====================================\n");

        // Create HashSet
        Set<String> bogies = new HashSet<>();

        // ADD IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}