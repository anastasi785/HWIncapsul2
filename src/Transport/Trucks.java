package Transport;

public class Trucks extends Car implements Driving{
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

  //  @Override
    public String pitStop() {
        return "Сделать остановку";
    }

 //   @Override
    public void bestLapTime() {
        System.out.println("В пределах 56 сек");

    }

  //  @Override
    public void maxSpeed() {
        System.out.println(" Максимальная скорость составляет 150 км/ч");

    }

    @Override
    public void startToDrive() {

    }

    @Override
    public void stopToDrive() {

    }

    @Override
    public void refillCar() {

    }
}
