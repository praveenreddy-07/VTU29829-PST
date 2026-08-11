import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String first = sc.next();
            String second = sc.next();

            set.add(first + " " + second);

            System.out.println(set.size());
        }
    }
}
