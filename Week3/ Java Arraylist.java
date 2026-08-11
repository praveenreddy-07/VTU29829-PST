import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayQueries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int numElements = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < numElements; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }

        int numQueries = scanner.nextInt();
        for (int k = 0; k < numQueries; k++) {
            int lineIndex = scanner.nextInt();
            int positionIndex = scanner.nextInt();

            if (lineIndex >= 1 && lineIndex <= n) {
                ArrayList<Integer> selectedLine = lines.get(lineIndex - 1);
                if (positionIndex >= 1 && positionIndex <= selectedLine.size()) {
                    System.out.println(selectedLine.get(positionIndex - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
