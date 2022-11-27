package pl.wp.rp0077.transport;

public class Truck implements CargoTransport{
    @Override
    public void process() {
        System.out.println("3 dni");
    }
}
