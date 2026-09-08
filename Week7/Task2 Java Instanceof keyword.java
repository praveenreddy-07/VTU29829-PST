Problem Statement:
  The Java instanceof operator is used to test if the object or instance is an instanceof the specified type.
In this problem we have given you three classes in the editor:
Student class
Rockstar class
Hacker class
In the main method, we populated an ArrayList with several instances of these classes. count method calculates how many instances of each type is present in the ArrayList. The code prints three integers, the number of instance of Student class, the number of instance of Rockstar class, the number of instance of Hacker class.
But some lines of the code are missing, and you have to fix it by modifying only  lines! Don't add, delete or modify any extra line.
To restore the original code in the editor, click on the top left icon in the editor and create a new buffer.


  Pragram:
  import java.util.ArrayList;
import java.util.Scanner;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Solution {

    static void count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (Object element : mylist) {
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }
        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scan.next();
            if (s.equals("Student"))
                mylist.add(new Student());
            if (s.equals("Rockstar"))
                mylist.add(new Rockstar());
            if (s.equals("Hacker"))
                mylist.add(new Hacker());
        }
        count(mylist);
        scan.close();
    }
}
