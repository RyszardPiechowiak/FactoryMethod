package pl.wp.rp0077.abstractFactory;

public class FactoryProvider {
    static AbstractFactory getFactory(FactoryMode mode) {
        if (FactoryMode.PASSENGER == mode) {
            return new PassengerFactory();
        } else if (FactoryMode.CARGO == mode) {
            return new CargoFactory();
        }
        return null;
    }
}
