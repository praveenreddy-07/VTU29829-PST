import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String date1_ex1 = "2019-06-29";
        String date2_ex1 = "2019-06-30";
        System.out.println("Example 1:");
        System.out.println("Input: date1 = \"" + date1_ex1 + "\", date2 = \"" + date2_ex1 + "\"");
        System.out.println("Output: " + sol.daysBetweenDates(date1_ex1, date2_ex1));
        System.out.println();

        String date1_ex2 = "2020-01-15";
        String date2_ex2 = "2019-12-31";
        System.out.println("Example 2:");
        System.out.println("Input: date1 = \"" + date1_ex2 + "\", date2 = \"" + date2_ex2 + "\"");
        System.out.println("Output: " + sol.daysBetweenDates(date1_ex2, date2_ex2));
        System.out.println();

        String date1_ex3 = "2023-11-01";
        String date2_ex3 = "2024-02-10";
        System.out.println("Additional Test Case:");
        System.out.println("Input: date1 = \"" + date1_ex3 + "\", date2 = \"" + date2_ex3 + "\"");
        System.out.println("Output: " + sol.daysBetweenDates(date1_ex3, date2_ex3));
        System.out.println();
    }
}
