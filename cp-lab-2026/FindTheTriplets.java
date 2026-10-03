import java.util.Scanner;

public class FindTheTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] values = new int[size];
        for (int index = 0; index < size; index++) values[index] = scanner.nextInt();
        int target = scanner.nextInt();
        for (int index = 0; index < size - 1; index++) {
            for (int next = 0; next < size - index - 1; next++) {
                if (values[next] > values[next + 1]) {
                    int temporary = values[next];
                    values[next] = values[next + 1];
                    values[next + 1] = temporary;
                }
            }
        }
        boolean found = false;
        for (int first = 0; first < size - 2; first++) {
            int second = first + 1;
            int third = size - 1;
            while (second < third) {
                int sum = values[first] + values[second] + values[third];
                if (sum == target) {
                    System.out.println(values[first] + " " + values[second] + " " + values[third]);
                    found = true;
                    second++;
                    third--;
                } else if (sum < target) {
                    second++;
                } else {
                    third--;
                }
            }
        }
        if (!found) System.out.print("No Triplet Found");
    }
}