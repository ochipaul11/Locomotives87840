public class Main {

    public static void main(String[] args) {

        LandVehicles car=new LandVehicles("Toyota","7","Public",4, 20 );

        car.printLandVehicleDetail();

        WaterVehicles boat=new WaterVehicles("Korea","10",5,2,"short");

        boat.printWaterVehicleDetail();

        airVehicle plane= new airVehicle("Boeing","300",4,"Passanger plane");

        plane.printLandVehicleDetail();
    }



}
