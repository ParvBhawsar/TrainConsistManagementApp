import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 *
 * @author Developer
 * @version 11.0
 */

public class TrainConsistManagementApp {

    // Reusable validation methods for tests
    public static boolean validateTrainId(String trainId) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean validateCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("==============================================\n");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID: " + trainId);
        System.out.println("Cargo Code: " + cargoCode);

        boolean trainValid = validateTrainId(trainId);
        boolean cargoValid = validateCargoCode(cargoCode);

        System.out.println("\nTrain ID Valid? " + trainValid);
        System.out.println("Cargo Code Valid? " + cargoValid);

        System.out.println("\nUC11 regex validation completed...");
    }
}