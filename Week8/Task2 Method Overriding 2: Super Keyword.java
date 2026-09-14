class Arithmetic {
    String myString = "Hello";

    public void myMethod() {
        System.out.println("Hello from Arithmetic");
    }
}

class Adder extends Arithmetic {
    String myString = "Hello from Adder";

    public void myMethod() {
        System.out.println("Hello from Adder");
        System.out.println(super.myString);
        super.myMethod();
    }
}

public class Solution {
    public static void main(String[] args) {
        Adder a = new Adder();
        a.myMethod();
    }
}
