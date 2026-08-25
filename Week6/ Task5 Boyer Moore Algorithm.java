import java.util.Scanner;

public class Main {

    public static int marsExploration(String s) {
        int count = 0;
        String pattern = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(marsExploration(s));

        sc.close();
    }
}
