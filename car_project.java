class VehicleDetails{
    public static void main(String[] args) {
        String VehicleName = "Mahindra Scorpio S 11";
        String EngineType ="mHAWK 4 Cylinder";
        String Displacement = "2184 cc";
        String MaxPower = "130bhp@3750rpm";
        String MaxTorque = "300Nm@1600-2800rpm";
        Byte NofCylinders = 4;
        Byte ValvesPerCylinder = 4;
        String FuelSupplySystem = "CRDi";
        boolean Turbocharger = true;
        String TransmissionType = "Manual";
        String Gearbox = "6-Speed";
        String DriveType = "RWD";
        System.out.println("Vehicle Name: " + VehicleName);
        System.out.println("Engine Type: " + EngineType);   
        System.out.println("Displacement: " + Displacement);
        System.out.println("Max Power: " + MaxPower);
        System.out.println("Max Torque: " + MaxTorque);
        System.out.println("Number of Cylinders: " + NofCylinders);
        System.out.println("Valves per Cylinder: " + ValvesPerCylinder);
        System.out.println("Fuel Supply System: " + FuelSupplySystem);
        System.out.println("Turbocharger: " + Turbocharger);
        System.out.println("Transmission Type: " + TransmissionType);
        System.out.println("Gearbox: " + Gearbox);
        System.out.println("Drive Type: " + DriveType);
    }
}
