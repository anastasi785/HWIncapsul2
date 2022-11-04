package Transport;

public class Bus1 extends Car implements Driving {

    public enum Capacity {
        TINY("до 10 мест"), SMALL("до 25 мест"), AVERAGE("40–50 мест"),
        BIG("60–80 мест"), VERY_BIG("100–120 мест");




        private  String recognizeBySeats;

        Capacity(String recognizeBySeats) {
            this.recognizeBySeats = recognizeBySeats;
        }

        public String getRecognizeBySeats() {
            return recognizeBySeats;
        }

        public void setRecognizeBySeats(String recognizeBySeats) {
            this.recognizeBySeats = recognizeBySeats;
        }
    }
    private  String recognizeByMsg;

    private Capacity[] gCapacities = new Capacity[0];

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
        return "Сделать остановку на 50 сек";
    }

    //   @Override
    public void bestLapTime() {

        System.out.println("В пределах 80 сек");
    }

//    @Override
//    public void maxSpeed() {
    //       System.out.println("Максимальная скорость 120 км/ч");}


    @Override
    public void startToDrive() {
    }

    @Override
    public void stopToDrive() {
    }

    @Override
    public void refillCar() {
    }



    public String [] getAllCapacities () {
        String []capasities=new String[Capacity.values().length];
        for (int i = 0; i <capasities.length ; i++) {
            capasities[i]= Capacity.values()[i].name();
        }
        return capasities;

    }

    public void chooseCapacity (String capacity) {
        System.out.println("выбор типа кузова " + capacity);
        Capacity gCapacity = Capacity.valueOf(capacity);
        switch (gCapacity) {
            case TINY:
                System.out.println("до 10 мест");
                break;
            case SMALL:
                System.out.println(" до 25 мест");
                break;
            case AVERAGE:
                System.out.println("40–50 мест");
                break;
            case BIG:
                System.out.println("60–80 мест");
                break;
            case VERY_BIG:
                System.out.println("100–120 мест");
                break;

            default:
                System.out.println("Нет такой вместимости");
        }
    }
}