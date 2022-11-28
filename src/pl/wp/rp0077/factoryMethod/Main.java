package pl.wp.rp0077.factoryMethod;

import pl.wp.rp0077.factoryMethod.CargoTransport;
import pl.wp.rp0077.factoryMethod.TransportFactory;

public class Main {
    public static void main(String[] args) {
        CargoTransport cargoTransport = TransportFactory.getTransport("Truck");
        //wywołanie
        cargoTransport.process();
    }
}