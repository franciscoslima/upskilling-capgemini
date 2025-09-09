package list01.factory.digitalDocuments;

import list01.factory.electricVehicle.ElectricCar;
import list01.factory.electricVehicle.ElectricMotorcycle;
import list01.factory.electricVehicle.ElectricScooter;

public class DocumentFactory {
    public Document getDocument(String type) {
        if(type.equalsIgnoreCase("invoice")) return new Invoice();
        else if(type.equalsIgnoreCase("receipt")) return new Receipt();
        else if(type.equalsIgnoreCase("contract")) return new Contract();
        throw new IllegalArgumentException("Invalid Type");
    }
}
