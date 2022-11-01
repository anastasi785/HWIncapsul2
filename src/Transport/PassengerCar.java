package Transport;

public class PassengerCar extends Car implements Competitors{
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

    @Override
    public String pitStop() {
        return "Сделать остановку на 40 сек";
    }

    @Override
    public void bestLapTime() {

        System.out.println("В пределах 40 сек");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 200 км/ч");

    }
}
