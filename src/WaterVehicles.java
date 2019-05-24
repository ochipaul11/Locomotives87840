public class WaterVehicles extends Locomotive implements LocomotiveInterface{

    private int numberOfPropellers;
    private int waterdepth;
    private String distance;

    public WaterVehicles(String manufacturer, String capacity, int numberOfPropellers, int waterdepth, String distance) {
        super(manufacturer, capacity);
        this.numberOfPropellers = numberOfPropellers;
        this.waterdepth = waterdepth;
        this.distance = distance;
    }

    public int getNumberOfPropellers() {
        return numberOfPropellers;
    }

    public void setNumberOfPropellers(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    public int getWaterdepth() {
        return waterdepth;
    }

    public void setWaterdepth(int waterdepth) {
        this.waterdepth = waterdepth;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public void costs() {
        System.out.println("The cost of running watervehicle ranges from Ksh100 to 22,000.");
    }

    public void printWaterVehicleDetail(){
        System.out.println("Type: "+WaterVehicles.class.getName()+" Manufacturer:" +getManufacturer() +" Number of propellers:" + getNumberOfPropellers()+
                " Water Denth:"+ getWaterdepth() +" Distance:"+ getDistance() );




    }


}
