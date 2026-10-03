import java.util.Scanner;

public class CountingSort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] counts = new int[100];
        for (int index = 0; index < size; index++) counts[scanner.nextInt()]++;
        for (int count : counts) System.out.print(count + " ");
    }
}