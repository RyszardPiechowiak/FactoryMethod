package pl.wp.rp0077.abstractFactory.transport;

public class CargoPlane implements Transport {

    @Override
    public void process() {
        System.out.println("2 godziny");
    }
}
