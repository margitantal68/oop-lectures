package lecture7;

import java.util.ArrayList;
import java.util.Random;

public class MainDriveable {
    public static void main(String[] args) {
        ArrayList<Driveable> driveables = new ArrayList<>();
        driveables.add( new Bicycle());
        driveables.add( new Car());
        driveables.add( new Bicycle());

        for( Driveable d: driveables ){
            d.start();// run-time, polymorphism, Overriding
        }
        System.out.println();
        Random rand = new Random();
        for( Driveable d: driveables ){
            d.turn( rand.nextInt( 360 ));// run-time, polymorphism, Overriding
        }
        System.out.println();
        for( Driveable d: driveables ){
            d.stop();
        }
        System.out.println();
        Driveable d2;
        d2 = new Car();
        d2.start();

    }
}
