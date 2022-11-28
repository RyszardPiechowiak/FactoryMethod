package pl.wp.rp0077.abstractFactory.transport;

public class CargoTruck implements Transport {

    @Override
    public void process() {
        System.out.println("8 godzin");
    }
}
