package list01.factory.electricVehicle;

public class ElectricVehicleFactory {
    public static ElectricVehicle getElectricVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("car")) return new ElectricCar();
        else if(vehicleType.equalsIgnoreCase("motorcycle")) return new ElectricMotorcycle();
        else if(vehicleType.equalsIgnoreCase("scooter")) return new ElectricScooter();
        throw new IllegalArgumentException("Invalid Type");
    }
}
