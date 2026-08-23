import java.util.*;

public class MatrixRotation {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

       

        int numLayers = Math.min(m, n) / 2;

        for (int layer = 0; layer < numLayers; layer++) {
          
            List<Integer> currentLayer = new ArrayList<>();

            
            for (int j = layer; j < n - 1 - layer; j++) {
                currentLayer.add(matrix.get(layer).get(j));
            }

            
            for (int i = layer; i < m - 1 - layer; i++) {
                currentLayer.add(matrix.get(i).get(n - 1 - layer));
            }

            
            for (int j = n - 1 - layer; j > layer; j--) {
                currentLayer.add(matrix.get(m - 1 - layer).get(j));
            }

            
            for (int i = m - 1 - layer; i > layer; i--) {
                currentLayer.add(matrix.get(i).get(layer));
            }

            
            int layerWidth = n - 2 * layer;
            int layerHeight = m - 2 * layer;
            int elementsInLayer = currentLayer.size();
            int effectiveRotations = r % elementsInLayer;

            
            if (effectiveRotations > 0) {
                List<Integer> rotatedLayer = new ArrayList<>();
                for (int i = 0; i < elementsInLayer; i++) {
                    rotatedLayer.add(currentLayer.get((i + effectiveRotations) % elementsInLayer));
                }
                currentLayer = rotatedLayer;
            }

           
            int currentIndex = 0;

            
            for (int j = layer; j < n - 1 - layer; j++) {
                matrix.get(layer).set(j, currentLayer.get(currentIndex++));
            }

            
            for (int i = layer; i < m - 1 - layer; i++) {
                matrix.get(i).set(n - 1 - layer, currentLayer.get(currentIndex++));
            }

            
            for (int j = n - 1 - layer; j > layer; j--) {
                matrix.get(m - 1 - layer).set(j, currentLayer.get(currentIndex++));
            }

            
            for (int i = m - 1 - layer; i > layer; i--) {
                matrix.get(i).set(layer, currentLayer.get(currentIndex++));
            }
        }

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix.get(i).get(j) + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }

        matrixRotation(matrix, r);

        scanner.close();
    }
}
