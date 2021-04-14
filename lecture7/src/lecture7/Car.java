package lecture7;

public class Car implements Driveable{

    @Override
    public void start() {
        System.out.println("Start Car");
    }

    @Override
    public void forward() {
        System.out.println("Forward Car");
    }

    @Override
    public void turn(double angle) {
        System.out.println("Turn Car " + angle );
    }

    @Override
    public void stop() {
        System.out.println("Stop Car");
    }
}
