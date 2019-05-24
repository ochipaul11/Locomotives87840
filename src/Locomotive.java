public class Locomotive {

    private String manufacturer;
    private String capacity;


    public Locomotive(String manufacturer, String capacity) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }


}
