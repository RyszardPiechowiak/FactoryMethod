package pl.wp.rp0077.transport;

public class Ship implements CargoTransport{
    @Override
    public void process() {
        System.out.println("1 tydzień");
    }
}
