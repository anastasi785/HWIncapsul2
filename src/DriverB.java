

import Transport.Driving;
import Transport.PassengerCar;



public class DriverB<G extends PassengerCar & Driving> {
    String name;
    String licence;
    String experience;

    public DriverB(String name, String licence, String experience) {
        this.name = name;
        this.licence = licence;
        this.experience = experience;
    }


    public void drive(G passengerCar) {
        passengerCar.startToDrive();

        passengerCar.refillCar();
        passengerCar.stopToDrive();
        System.out.println("водитель с категорией прав " + getLicence() + " управляет  автомобилем " + passengerCar.getBrand() +
                " и будет участвовать в заезде");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}