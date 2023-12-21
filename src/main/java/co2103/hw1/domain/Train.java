package co2103.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private int id;
    private String route;
    private String manufacturer;
    private List<Carriage> carriages;

    public Train() {
        // Default constructor
        this.carriages = new ArrayList<>();
    }

    public Train(int id, String route, String manufacturer) {
        this.id = id;
        this.route = route;
        this.manufacturer = manufacturer;
        this.carriages = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Carriage> getCarriages() {
        return carriages;
    }

    public void setCarriages(List<Carriage> carriages) {
        this.carriages = carriages;
    }

    public void addCarriage(Carriage carriage) {
        carriages.add(carriage);
    }
}
