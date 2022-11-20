package Transport;
import java.security.Key;
import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsCount;
    private boolean rubber;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, Key key, Insurance insurance) {
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (key == null) {
            this.key = new Key() {
                @Override
                public String getAlgorithm() {
                    return null;
                }

                @Override
                public String getFormat() {
                    return null;
                }

                @Override
                public byte[] getEncoded() {
                    return new byte[0];
                }
            };
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.transmission = "автомат";
        this.registrationNumber = "х000хх000";
        this.bodyType = "седан";
        this.seatsCount = 5;
        this.rubber = true;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this(brand, model, engineVolume,color,year,country, new Key(), new Insurance());
    }

    public static class key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public key() {
            this(true, true);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "автомат";
        } else {
            this.transmission = transmission;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey() {
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void changeRubber() {
        rubber = !rubber;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public static class Insurance {
        private final LocalDate validityPeriod;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidityPeriod() {
            if (validityPeriod.isBefore(LocalDate.now()) || validityPeriod.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно переоформлять страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }
    }
}
