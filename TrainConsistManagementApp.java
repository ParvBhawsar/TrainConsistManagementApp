import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * @author Developer
 * @version 13.0
 */

public class TrainConsistManagementApp {

    // Reuse bogie model
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    // Loop-based filtering
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // Stream-based filtering
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("==================================================\n");

        // Create dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("Bogie-" + i, i % 100));
        }

        // Loop timing
        long loopStart = System.nanoTime();
        List<Bogie> loopResult = filterUsingLoop(bogies);
        long loopEnd = System.nanoTime();

        // Stream timing
        long streamStart = System.nanoTime();
        List<Bogie> streamResult = filterUsingStream(bogies);
        long streamEnd = System.nanoTime();

        long loopTime = loopEnd - loopStart;
        long streamTime = streamEnd - streamStart;

        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nLoop Execution Time   : " + loopTime + " ns");
        System.out.println("Stream Execution Time : " + streamTime + " ns");

        System.out.println("\nUC13 benchmarking completed...");
    }
}