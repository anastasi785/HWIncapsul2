package Transport;

public class Train extends Transport {
      private int price;
      private int timeOfJorney;
      private String stationOfTakingOff;
      private String stationOfArriving;
      private int numbersOfCars;

    public Train(String brand, String model, int manufacturingYear, String manufactureCountry, String color, int maxSpeed,int price, int timeOfJorney, String stationOfTakingOff, String stationOfArriving, int numbersOfCars) {
        super(brand, model, manufacturingYear, manufactureCountry, color, 0);
        this.price = price;
        if (timeOfJorney <= 0) {
            this.timeOfJorney = 6;

    }else{
            this.timeOfJorney=timeOfJorney;}

        this.stationOfTakingOff = validofDefault(stationOfTakingOff,"defalt");
        this.stationOfArriving = validofDefault(stationOfArriving,"defalt");
        this.numbersOfCars = numbersOfCars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTimeOfJorney() {
        return timeOfJorney;
    }

    public void setTimeOfJorney(int timeOfJorney) {
        this.timeOfJorney = timeOfJorney;
    }

    public String getStationOfTakingOff() {
        return stationOfTakingOff;
    }

    public void setStationOfTakingOff(String stationOfTakingOff) {
        this.stationOfTakingOff = stationOfTakingOff;
    }

    public String getStationOfArriving() {
        return stationOfArriving;
    }

    public void setStationOfArriving(String stationOfArriving) {
        this.stationOfArriving = stationOfArriving;
    }

    public int getNumbersOfCars() {
        return numbersOfCars;
    }

    public void setNumbersOfCars(int numbersOfCars) {
        this.numbersOfCars = numbersOfCars;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Train{" +
                "price=" + price +
                ", timeOfJorney=" + timeOfJorney +
                ", stationOfTakingOff='" + stationOfTakingOff + '\'' +
                ", stationOfArriving='" + stationOfArriving + '\'' +
                ", numbersOfCars=" + numbersOfCars +
                '}';
    }
}
