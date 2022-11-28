package pl.wp.rp0077.abstractFactory;

import pl.wp.rp0077.abstractFactory.transport.Transport;
import pl.wp.rp0077.abstractFactory.transport.TransportType;

public abstract class AbstractFactory {
    abstract Transport getTransport(TransportType transportType);
}
