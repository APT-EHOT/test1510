package mainpackage;

public class Car {
    // static-поле не зависит и не влияет на экземпляры класса
    static String color;
    double price, maxSpeed;

    double fuelVolume = 500;

    double volumePer100Km = 10;

    private double maxDistance;

    int currentPassengers = 0;
    int seats;

    // Первичный конструктор
    public Car() {
        color = "black";
        price = 10000.0;
        maxSpeed = 120.0;
        maxDistance = getDistance();
        seats = 4;
    }

    public Car(String color, double price, double maxSpeed) {
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public Car(String color, double price) {
        this.color = color;
        this.price = price;
    }

    // Классический геттер - возвращает значение нужного поля
    // protected - видимость внутри пакета
    protected String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Доступ только внутри класса
    private double getDistance() {
        return fuelVolume / volumePer100Km * 100;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void addPassenger() {
        if (currentPassengers < seats)
            currentPassengers++;
        else
            System.out.println("Мест нет!");
    }

    public void removePassenger() {
        if (currentPassengers > 0)
            currentPassengers--;
        else
            System.out.println("Машина уже пустая");
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }
}
