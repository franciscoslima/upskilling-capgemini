package list01.factory.electricVehicle;

public class ElectricScooter implements ElectricVehicle {

    @Override
    public void chargeVehicle() {
        System.out.println("Charging ElectricScooter");
    }
}
