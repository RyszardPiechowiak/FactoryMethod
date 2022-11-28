package pl.wp.rp0077.abstractFactory;

import pl.wp.rp0077.abstractFactory.transport.TransportType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Transport towarów będzie trwał: ");
        AbstractFactory cargoFaktory = FactoryProvider.getFactory(FactoryMode.CARGO);
        cargoFaktory.getTransport(TransportType.PLANE).process();

        System.out.println("Transport osób będzie trwał: ");
        AbstractFactory passengerFaktory = FactoryProvider.getFactory(FactoryMode.PASSENGER);
        passengerFaktory.getTransport(TransportType.SHIP).process();

    }
}
