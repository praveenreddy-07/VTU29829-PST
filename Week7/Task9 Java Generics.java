Problem Statement:
  Generic methods are a very efficient way to handle multiple datatypes using a single method. 
  This problem will test your knowledge on Java Generic methods.
Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. 
The method should be able to accept both integer arrays or string arrays.


  Pragram:
  import java.util.*;

class Solution {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"Hello", "World"};
        printArray(a);
        printArray(b);
    }
}
