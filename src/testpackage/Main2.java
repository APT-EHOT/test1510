package testpackage;

import mainpackage.Car;

public class Main2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setColor("blue");
        // c.getColor(); // недоступно, тк protected
    }
}
