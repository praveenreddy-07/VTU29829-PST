import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int n = s.size();

        
        for (int i = 0; i <= n - m; i++) {
            int currentSum = 0;
           
            for (int j = 0; j < m; j++) {
                currentSum += s.get(i + j);
            }

  
            if (currentSum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int n = scanner.nextInt();

     
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(scanner.nextInt());
        }

      
        int d = scanner.nextInt();
        int m = scanner.nextInt();

    
        int result = birthday(s, d, m);
        System.out.println(result);

        scanner.close();
    }
}
