package list01.factory.electricVehicle;

public class App {
    public static void main(String[] args) {
        ElectricVehicle electricCar = ElectricVehicleFactory.getElectricVehicle("car");
        ElectricVehicle electricMotorcycle = ElectricVehicleFactory.getElectricVehicle("motorcycle");
        ElectricVehicle electricScooter = ElectricVehicleFactory.getElectricVehicle("scooter");

        electricCar.chargeVehicle();
        electricMotorcycle.chargeVehicle();
        electricScooter.chargeVehicle();
    }
}
