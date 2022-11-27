package pl.wp.rp0077;

import pl.wp.rp0077.transport.CargoTransport;
import pl.wp.rp0077.transport.TransportFactory;

public class Main {
    public static void main(String[] args) {
        CargoTransport cargoTransport = TransportFactory.getTransport("Truck");

        cargoTransport.process();
    }
}