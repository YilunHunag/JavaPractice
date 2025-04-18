package JavaPractice;

public class Scooter extends Vehicle{

    Scooter(){
        super(2);
    }

    @Override
    public String getVehicleType() {
        return "這台機車有 ";
    }

    @Override
    public void move(){
        System.out.println("摩托車移動");
    }
    
    @Override
    void stop(){
        System.out.println("摩托車停下來");
    }
    
}
