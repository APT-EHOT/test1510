package mainpackage;

// наследование
public class Van extends Car {

    int cargoVolume = 1000;

    public Van() {
        seats = 10;
    }

    public Van(int cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public Van(String color, double price, double maxSpeed, int cargoVolume) {
        super(color, price, maxSpeed); // перегрузка родительского конструктора
        this.cargoVolume = cargoVolume;
    }

    @Override
    public String toString() {
        return super.toString() + " cargoVolume=" + cargoVolume;
    }
}
