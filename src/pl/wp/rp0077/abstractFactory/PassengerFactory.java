package pl.wp.rp0077.abstractFactory;

import pl.wp.rp0077.abstractFactory.transport.*;

public class PassengerFactory extends AbstractFactory {
    @Override
    Transport getTransport(TransportType transportType) {
        Transport transport;
        switch (transportType){
            case BUS_TRUCK:
                transport = new PassengerBus();
                break;
            case SHIP:
                transport = new PassengerShip();
                break;
            case PLANE:
                transport= new PassengerPlane();
                break;
            default:
                transport = null;

        }
        return transport;
    }
}
