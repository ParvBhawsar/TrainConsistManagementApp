/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * @author Developer
 * @version 15.0
 */

public class TrainConsistManagementApp {

    // Custom runtime exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods bogie model
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular")
                        && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe cargo assignment: Petroleum cannot be assigned to Rectangular bogie"
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Exception: " + e.getMessage());

            } finally {
                System.out.println("Cargo assignment process completed.");
            }
        }

        @Override
        public String toString() {
            return shape + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("==================================================\n");

        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        System.out.println("\nApplication continues safely...");
    }
}