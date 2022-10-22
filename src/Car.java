public class Car {

        private String brand;
        private String model;
        private String productionCountry;
        String color;
        double engineVolume;
        private int productionYear;
        String gearBox;
        private String typeOfCarcase;
        int number;
        private int numberOfSeats;
        String signSummerOrWinterTires;
        public Car(String gearBox){
            this.brand=brand;
            this.model=model;
            this.productionCountry=productionCountry;
            this.color=color;
            this.engineVolume=engineVolume;
            this.productionYear=productionYear;
            if(gearBox!=null&&!gearBox.isEmpty()) {
                this.gearBox = gearBox;
            }else{
                this.gearBox="Автомат";
            }
        }

        public Car (String brand,String model,String productionCountry,String color, double engineVolume,int productionYear){
            this.brand=brand;
            this.model=model;
            this.productionCountry=productionCountry;
            this.color=color;
            this.engineVolume=engineVolume;
            this.productionYear=productionYear;

        }
        public Car (String brand,String model,String productionCountry,String color, int productionYear) {
            this.brand = brand;
            this.model = model;
            this.productionCountry = productionCountry;
            this.color = color;
            engineVolume = 1.5;
            this.productionYear = productionYear;
        }
        public Car (String brand,String model,String productionCountry, double engineVolume,int productionYear){
            this.brand=brand;
            this.model=model;
            this.productionCountry=productionCountry;
            color="белый";
            this.engineVolume=engineVolume;
            this.productionYear=productionYear;
        }
        public Car (String brand,String model,String productionCountry, String color,double engineVolume) {
            this.brand = brand;
            this.model = model;
            this.productionCountry = productionCountry;
            this.color=color;
            this.engineVolume = engineVolume;
            productionYear = 2000;
        }
        public Car(double engineVolume, String color, int productionYear){
            brand="default";
            model="default";
            productionCountry="default";
            this.color=color;
            this.engineVolume=engineVolume;
            this.productionYear=productionYear;

        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public String getProductionCountry() {
            return productionCountry;
        }

        public int getProductionYear() {
            return productionYear;
        }

        public String getTypeOfCarcase() {
            return typeOfCarcase;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getEngineVolume() {
            return engineVolume;
        }

        public void setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
        }

        public String getGearBox() {
            return gearBox;
        }

        public void setGearBox(String gearBox) {
            this.gearBox = gearBox;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getSignSummerOrWinterTires() {
            return signSummerOrWinterTires;
        }

        public void setSignSummerOrWinterTires(String signSummerOrWinterTires) {
            this.signSummerOrWinterTires = signSummerOrWinterTires;
        }

        void information(){
            System.out.println("Mарка "+ brand+" Модель "+model+" Страна производства "+productionCountry+" Цвет кузова "+color+" Объем двигателя в литрах "+engineVolume+" Год производства "+productionYear);
        }
    }


