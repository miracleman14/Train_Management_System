package co2103.hw1.domain;

public class Carriage {
    private String code;
    private String driver;
    private String type;
    private int seats;

    public Carriage() {
        // Default constructor
    }

    public Carriage(String code, String driver, String type, int seats) {
        this.code = code;
        this.driver = driver;
        this.type = type;
        this.seats = seats;
    }

    // Getters and Setters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
