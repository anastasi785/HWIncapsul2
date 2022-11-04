package Transport;

public class PassengerCar extends Car implements Driving {

    public enum BodyType {
        SEDAN, HACHBACK, CUPE, STAT_WAGON, SUV, CROSS, PICKUP, VAN, MINIVAN;


        private String recognizeBodyType;

        public static PassengerCar.BodyType getRecognizeBodyType(String recognizeBodyType) {

                for (PassengerCar.BodyType bodyType :values()) {
                    if (bodyType.getRecognizeBodyType().equals(recognizeBodyType)) {
                        return bodyType;
                    }
                }
                return null;


            }

        public String getRecognizeBodyType() {
            return recognizeBodyType;
        }

        public void setRecognizeBodyType(String recognizeBodyType) {
            this.recognizeBodyType = recognizeBodyType;
        }
    }



    private BodyType[] bodyTypes = new BodyType[0];

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

    //   @Override
    public String pitStop() {
        return "Сделать остановку на 40 сек";
    }

    //    @Override
    public void bestLapTime() {
        System.out.println("В пределах 40 сек");
    }

    //   @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость 200 км/ч");
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


    public String [] getAllTypes () {
        String []types=new String[BodyType.values().length];
        for (int i = 0; i <types.length ; i++) {
            types[i]=BodyType.values()[i].name();
        }
        return types;

    }

    public BodyType[] getBodyTypes() {
        return bodyTypes;
    }

    public void setBodyTypes(BodyType[] bodyTypes) {
        this.bodyTypes = bodyTypes;
    }

    public void chooseBodyType (String type ) {
        System.out.println("выбор типа кузова " + type);
        BodyType bodyType = BodyType.valueOf(type);
        switch (bodyType) {
            case SEDAN:
                System.out.println("Выбран седан");

                break;
            case HACHBACK:
                System.out.println("Выбран Хэчбек");

                break;
            case CUPE:
                System.out.println("Выбран Купе");
                break;
            case STAT_WAGON:
                System.out.println("Выбран Универсал");
                break;
            case SUV:
                System.out.println("Выбран Внедорожник");
                break;
            case CROSS:
                System.out.println("Выбран Кроссовер");
                break;
            case PICKUP:
                System.out.println("Выбран Пикап");
            case VAN:
                System.out.println("выбран Фургон");
                break;
            case MINIVAN:
                System.out.println("Выбран Минивэн");
                break;
            default:
                System.out.println("Нет такого типв кузова");


        }
    }
}