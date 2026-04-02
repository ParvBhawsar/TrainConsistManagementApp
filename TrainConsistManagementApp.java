/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 14: Handle Invalid Bogie Capacity
 *
 * @author Developer
 * @version 14.0
 */

public class TrainConsistManagementApp {

    // Custom checked exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Passenger bogie model
    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==================================================\n");

        try {
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println("Valid bogie created: " + validBogie);

            // Uncomment to test invalid case
            // PassengerBogie invalidBogie = new PassengerBogie("AC Chair", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}