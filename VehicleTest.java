package JavaPractice;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new Bycycle(),
            new Scooter(),
            new Airplane(),
            new Boat()
        };

        for (Vehicle v : vehicles){
            v.showWheels();
            v.move();
            // 不同燃料
            if (v instanceof Car) v.fuel(" 汽油 ");
            else if (v instanceof Bycycle) v.fuel(" 人的體力 ");
            else if (v instanceof Scooter) v.fuel(" 機油 ");
            else if (v instanceof Airplane) v.fuel(" 飛機燃料 ");
            else if (v instanceof Boat) v.fuel(" 柴油 ");
            v.stop();
            System.out.println("---end---");
        }
    }
}
