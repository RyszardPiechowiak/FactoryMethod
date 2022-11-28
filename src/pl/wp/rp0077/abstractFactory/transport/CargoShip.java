package pl.wp.rp0077.abstractFactory.transport;

public class CargoShip implements Transport {

    @Override
    public void process() {
        System.out.println("5 godzin");
    }
}
