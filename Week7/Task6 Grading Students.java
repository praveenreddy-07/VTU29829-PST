Problem Statement:
  HackerLand University has the following grading policy:
> Every student receives a grade in the inclusive range from  0 to 100 .
> Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade  according to these rules:
> If the difference between the grade and the next multiple of 5 is less than 3 , round  up to the next multiple of 5.
> If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.

  Program:
import java.util.*;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 38) {
                roundedGrades.add(grade);
            } else {
                int remainder = grade % 5;
                if (remainder >= 3) {
                    int roundedGrade = grade + (5 - remainder);
                    roundedGrades.add(roundedGrade);
                } else {
                    roundedGrades.add(grade);
                }
            }
        }
        return roundedGrades;
    }

}

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            grades.add(scanner.nextInt());
        }
        List<Integer> roundedGrades = Result.gradingStudents(grades);
        for (int grade : roundedGrades) {
            System.out.println(grade);
        }
        scanner.close();
    }
}
