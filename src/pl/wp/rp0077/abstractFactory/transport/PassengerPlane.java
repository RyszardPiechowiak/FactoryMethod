package pl.wp.rp0077.abstractFactory.transport;

public class PassengerPlane implements Transport{
    @Override
    public void process() {
        System.out.println("1 godzina");
    }
}
