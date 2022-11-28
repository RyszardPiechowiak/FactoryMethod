package pl.wp.rp0077.abstractFactory.transport;

public class PassengerBus implements Transport{
    @Override
    public void process() {
        System.out.println("7 godzina");
    }
}
