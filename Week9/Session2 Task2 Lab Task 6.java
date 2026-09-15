import java.util.*;

abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class Bike extends Ride {

    Bike(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 10;
    }
}

class Auto extends Ride {

    Auto(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 15;
    }
}

class Cab extends Ride {

    Cab(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 20;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance: ");
        double distance = sc.nextDouble();

        Ride bike = new Bike(distance);
        Ride auto = new Auto(distance);
        Ride cab = new Cab(distance);

        System.out.println("Bike Fare: " + bike.calculateFare());
        System.out.println("Auto Fare: " + auto.calculateFare());
        System.out.println("Cab Fare: " + cab.calculateFare());

        sc.close();
    }
}
