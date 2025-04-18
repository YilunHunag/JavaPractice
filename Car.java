package JavaPractice;

public class Car extends Vehicle {

    Car(){
        super(4);
    }

    @Override
    public String getVehicleType() {
        return "這輛車有 ";
    }

    @Override
    public void move(){
        System.out.println("汽車移動");
    }

    @Override
    void stop(){
        System.out.println("汽車停下來");
    }
    
}
