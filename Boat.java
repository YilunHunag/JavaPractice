package JavaPractice;

public class Boat extends Vehicle{

    Boat(){
        super(0);
    }

    @Override
    public String getVehicleType() {
        return "這艘船有 ";
    }

    @Override
    public void move(){
        System.out.println("船在海上航行");
    }

    @Override
    void stop(){
        System.out.println("船靠岸停下來");
    }
}
