import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();

            if (n < 0) {
                throw new Exception(
                    "Exception: n should be greater than 0"
                );
            }

            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println(factorial);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
