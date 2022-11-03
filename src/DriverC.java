import Transport.Driving;

import Transport.Trucks;


    public class DriverC<H extends Trucks & Driving> {
        String name;
        String licence;
        String experience;

        public DriverC(String name, String licence, String experience) {
            this.name = name;
            this.licence = licence;
            this.experience = experience;
        }


        public void drive(H trucks) {
            trucks.startToDrive();

            trucks.refillCar();
            trucks.stopToDrive();
            System.out.println("водитель с категорией прав " + getLicence() + " управляет грузовым автомобилем " + trucks.getBrand() +
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


