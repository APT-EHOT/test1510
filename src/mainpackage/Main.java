package mainpackage;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        // тип_переменной имя = значение
        // new - выделение памяти
        Car firstCar = new Car();
        Car secondCar = new Car("red", 20000.0, 200.0);
        Car thirdCar = new Car("red", 20000.0);
        System.out.println(firstCar);
        System.out.println(secondCar);

        // через геттеры и сеттеры
        System.out.println(secondCar.getColor());
        secondCar.setColor("yellow");
        System.out.println(secondCar.getColor());

        // напрямую
        System.out.println(firstCar.color);
        firstCar.color = "green";
        System.out.println(firstCar.color);
        System.out.println(secondCar.color);
        System.out.println(thirdCar.color);

        Calculations c = new Calculations();
        c.sum(10, 20);
        Calculations.sub(10, 20);

        System.out.println(firstCar.getMaxDistance());

        firstCar.addPassenger();
        firstCar.removePassenger();

        Van van = new Van(2000);
        System.out.println(secondCar);
        System.out.println(van);

        System.out.println(van.currentPassengers);
        van.addPassenger();
        System.out.println(van.currentPassengers);
        van.addPassenger();
        van.addPassenger();

        System.out.println(van.seats);

        Ambulance ambulance = new Ambulance();
        System.out.println(ambulance.seats);
    }
}
