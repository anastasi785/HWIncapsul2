package Transport;

public class Bus1 extends Car implements Driving {
    public Bus1(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startOfMoving() {

    }

    @Override
    public void stopMoving() {

    }


    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
    public String pitStop() {
        return  "Сделать остановку на 50 сек";
    }

 //   @Override
    public void bestLapTime() {

        System.out.println("В пределах 80 сек");
    }

//    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 120 км/ч");

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
