package Transport;

public class PassengerCar extends Car{
    public PassengerCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startOfMoving() {
        System.out.println("нажать на педаль");

    }

    @Override
    public void stopMoving() {
        System.out.println("отпустить педаль и заглушить мотор");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
