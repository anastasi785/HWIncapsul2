package Transport;

import java.time.LocalDate;

public class Car extends Transport {

    private float engineVolume;



    private String gearBox;
    private final String bodyType;
    private String regNumber;
    private final int placesCount;
    private boolean winterTires;


    private final Key key;
    private final Insurance insurance;

    public Car(String brand, String model,
               float engineVolume, String color,
               int manufacturingYear,
               String manufactureCountry,
               String gearBox, String bodyType,
               String regNumber,int placesCount,
               Key key, Insurance insurance) {
        super(brand,model,manufacturingYear,manufactureCountry,color,0);

        this.bodyType = validofDefault(bodyType, "default");

        this.placesCount = Math.max(placesCount, 1);

        this.key = key;
        this.insurance = insurance;
        setEngineVolume(engineVolume);
        setGearBox(gearBox);
        setRegNumber(regNumber);
        setWinterTires(winterTires);
    }



    private String validofDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getDayOfMonth();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumber(regNumberChars[4])
                && isNumber(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "ABEKMHOPCTYX";
        return allowedSymbols.contains("" + symbol);
    }


    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume >= 0.0f ? engineVolume : 1.5f;
    }



    public void setGearBox(String gearBox) {
        if (gearBox == null || !gearBox.isBlank()) {
            this.gearBox = "No information";
        } else {
            this.gearBox = gearBox;
        }
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = validofDefault(regNumber, "default");
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keyLessAccess;

        public Key(boolean remoteEngineStart, boolean keyLessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keyLessAccess = keyLessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keyLessAccess=" + keyLessAccess +
                    '}';
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            if (number == null || number.isBlank()) {
                this.number = "default";
            } else {
                this.number = number;

            }
        }

        public boolean isNumberValid() {
            return number.length() == 9;
        }

        public boolean isInshuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "validUntil=" + validUntil +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }



    public float getEngineVolume() {
        return engineVolume;
    }



    public String getGearBox() {
        return gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getPlacesCount() {
        return placesCount;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + getColor() + '\'' +
                ", manufacturingYear=" + getManufacturingYear() +
                ", manufactureCountry='" + getManufactureCountry() + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", placesCount=" + placesCount +
                ", winterTires=" + winterTires +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }
}







