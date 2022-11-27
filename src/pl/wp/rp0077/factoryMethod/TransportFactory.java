package pl.wp.rp0077.factoryMethod;

public class TransportFactory {
    public static final String TRUCK = "truck";
    public static final String PLANE = "plane";
    public static final String SHIP = "ship";

    public static CargoTransport getTransport(String transportName){
        CargoTransport cargoTransport = null;
        if (TRUCK.equalsIgnoreCase(transportName)){
            cargoTransport = new Truck();
        } else if (PLANE.equalsIgnoreCase(transportName)) {
            cargoTransport = new Plane();
        } else if (SHIP.equalsIgnoreCase(transportName)) {
            cargoTransport = new Ship();
        }
        return cargoTransport;
    }

}
