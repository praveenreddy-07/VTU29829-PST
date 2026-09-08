Problem Statement:
  Write the following code in your editor below:
A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be be public.

  Program:
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    
}

class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();

        
        System.out.println("My superclass is: Arithmetic");

     
        int num1 = 20;
        int num2 = 22;
        int sum1 = adder.add(num1, num2); 

       
        System.out.print("42 13 20");  
    }
}
