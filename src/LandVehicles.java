public class LandVehicles extends Locomotive{
    private String usage;
    private int numberOfWheels;
    private int amountOfFuel;

    public LandVehicles(String manufacturer, String capacity, String usage, int numberOfWheels, int amountOfFuel) {
        super(manufacturer, capacity);
        this.usage = usage;
        this.numberOfWheels = numberOfWheels;
        this.amountOfFuel = amountOfFuel;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public void setAmountOfFuel(int amountOfFuel) {
        this.amountOfFuel = amountOfFuel;
    }

    public void printLandVehicleDetail(){
        System.out.println("Type: "+LandVehicles.class.getName()+" Manufacturer:" +getManufacturer() +" Usage:" + getUsage()+
                " Number of Wheels:"+ getNumberOfWheels() +"Amount of fuel:"+ getAmountOfFuel());

    }
}


