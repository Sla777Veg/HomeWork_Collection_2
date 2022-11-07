import java.util.concurrent.ThreadLocalRandom;

public class CargoCar extends Transport implements Competing {


    public CargoCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


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
    @Override
    public void pitStop() {
        System.out.printf("грузовой автомобиль %s совершил Пит-Стоп"+ "\n", this.brand);
    }

    @Override
    public int bestLap() {
        return ThreadLocalRandom.current().nextInt(1,2000);
    }

    @Override
    public int maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,200);
    }

    @Override
    public String toString() {
        return "CargoCar{" +
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
}
