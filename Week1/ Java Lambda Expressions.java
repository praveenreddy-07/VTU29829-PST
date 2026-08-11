import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a < 2) {
                return false;
            }

            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (int a) -> {
            String s = String.valueOf(a);
            String reverse = new StringBuilder(s).reverse().toString();

            return s.equals(reverse);
        };
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int condition = sc.nextInt();
            int number = sc.nextInt();

            if (condition == 1) {
                System.out.println(
                    MyMath.checker(MyMath.isOdd(), number)
                    ? "ODD"
                    : "EVEN"
                );

            } else if (condition == 2) {
                System.out.println(
                    MyMath.checker(MyMath.isPrime(), number)
                    ? "PRIME"
                    : "COMPOSITE"
                );

            } else if (condition == 3) {
                System.out.println(
                    MyMath.checker(MyMath.isPalindrome(), number)
                    ? "PALINDROME"
                    : "NOT PALINDROME"
                );
            }
        }

        sc.close();
    }
}
