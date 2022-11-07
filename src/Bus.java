import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {


    @Override
    public void repairCar() {
        System.out.println("Машина "+getBrand()+" "+getModel()+" починена");
    }

    @Override
    public boolean carryOutMaintenance() {
        return false;
    }

    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s совершил Пит-Стоп"+ "\n", this.brand);
    }

    @Override
    public int bestLap() {
        return ThreadLocalRandom.current().nextInt(1,1500);
    }

    @Override
    public int maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,180);
    }
}
