package pl.wp.rp0077.abstractFactory;

import pl.wp.rp0077.abstractFactory.AbstractFactory;
import pl.wp.rp0077.abstractFactory.transport.*;

public class CargoFactory extends AbstractFactory {
    @Override
    Transport getTransport(TransportType transportType) {
        Transport transport;
        switch (transportType){
            case BUS_TRUCK:
                transport = new CargoTruck();
                break;
            case SHIP:
                transport = new CargoShip();
                break;
            case PLANE:
                transport= new CargoPlane();
                break;
            default:
                transport = null;

        }
        return transport;
    }
}
