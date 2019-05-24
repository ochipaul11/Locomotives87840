public class airVehicle extends Locomotive {

    private int numberOfEnginess;
    private String purpose;

    public airVehicle(String manufacturer, String capacity, int numberOfEnginess, String purpose) {
        super(manufacturer, capacity);
        this.numberOfEnginess = numberOfEnginess;
        this.purpose = purpose;
    }

    public int getNumberOfEnginess() {
        return numberOfEnginess;
    }

    public void setNumberOfEnginess(int numberOfEnginess) {
        this.numberOfEnginess = numberOfEnginess;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void printLandVehicleDetail() {
        System.out.println("Type: " + LandVehicles.class.getName() + " Manufacturer:" + getManufacturer() + " Number of Engines:" + getNumberOfEnginess() +
                " Plane Purpose:" + getPurpose());

    }

}
