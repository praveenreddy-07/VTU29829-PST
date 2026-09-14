import java.util.*;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "The factory returned class Pizza";
    }
}

class Cake implements Food {
    public String getType() {
        return "The factory returned class Cake";
    }
}

class FoodFactory {

    public Food getFood(String order) {

        if (order.equals("pizza")) {
            return new Pizza();
        }

        if (order.equals("cake")) {
            return new Cake();
        }

        return null;
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodFactory factory = new FoodFactory();

        Food food = factory.getFood(sc.nextLine());

        System.out.println("The factory returned " +
                           food.getClass().getSimpleName());

        System.out.println(food.getType());
    }
}
