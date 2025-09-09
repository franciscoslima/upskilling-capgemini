package list01.factory.electricVehicle;

public class ElectricMotorcycle implements ElectricVehicle {

    @Override
    public void chargeVehicle() {
        System.out.println("Charging ElectricMotorcycle");
    }
}
