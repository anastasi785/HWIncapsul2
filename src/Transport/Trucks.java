package Transport;

public class Trucks extends Car implements Driving {
    public enum LoadCapacity {NUM_1, NUM_2, NUM_3}

    private LoadCapacity[] loadCapacities = new LoadCapacity[0];

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



    public String [] getAllLoadCapacities () {
        String []variations=new String[LoadCapacity.values().length];
        for (int i = 0; i <variations.length ; i++) {
            variations[i]=LoadCapacity.values()[i].name();
        }
        return variations;

    }


    public void chooseLoadCapacity(String capacity) {
        System.out.println("ГРУЗОПОДЬЁМНОСТЬ " + capacity);
        LoadCapacity loadCapacity = LoadCapacity.valueOf(capacity);
        switch (loadCapacity) {
            case NUM_1:
                System.out.println("с полной массой до 3,5 тонн");

                break;
            case NUM_2:
                System.out.println(" с полной массой свыше 3,5 до 12 тонн");

                break;
            case NUM_3:
                System.out.println("с полной массой свыше 12 тонн");
                break;
            default:
                System.out.println("Нет такой грузоподъёмности");
        }
    }
}