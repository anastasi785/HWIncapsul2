package Transport;

public class Trucks extends Car{
    public Trucks(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startOfMoving() {
        System.out.println(" повернуть рычаг");

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
