import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class BucketSort {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        float[] values = new float[size];
        ArrayList<Float>[] buckets = new ArrayList[size];
        for (int index = 0; index < size; index++) buckets[index] = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            values[index] = scanner.nextFloat();
            int bucket = (int) (values[index] * size);
            if (bucket >= size) bucket = size - 1;
            buckets[bucket].add(values[index]);
        }
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
            for (float value : bucket) {
                if (value == (int) value) System.out.print((int) value + " ");
                else System.out.printf(Locale.US, "%.2f ", value);
            }
        }
    }
}