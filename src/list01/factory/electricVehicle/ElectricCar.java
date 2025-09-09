package list01.factory.electricVehicle;

public class ElectricCar implements ElectricVehicle {

    @Override
    public void chargeVehicle() {
        System.out.println("Charging ElectricCar");
    }
}
