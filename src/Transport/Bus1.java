package Transport;

public class Bus1 extends Car{
    public Bus1(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startOfMoving() {
        System.out.println("нажать на педаль");

    }

    @Override
    public void stopMoving() {
        System.out.println("отпустить педаль");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
