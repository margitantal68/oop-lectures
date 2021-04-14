package lecture7;

public class Bicycle implements Driveable{
    @Override
    public void start() {
        System.out.println("Start Bicycle");
    }

    @Override
    public void forward() {
        System.out.println("Forward Bicycle");
    }

    @Override
    public void turn(double angle) {
        System.out.println("Turn Bicycle " + angle);
    }

    @Override
    public void stop() {
        System.out.println("Stop Bicycle");
    }
}
