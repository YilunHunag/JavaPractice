package JavaPractice;

public class Airplane extends Vehicle{
    
    Airplane(){
        super(0);
    }

    @Override
    public String getVehicleType() {
        return "這架飛機有 ";
    }

    @Override
    public void move(){
        System.out.println("飛機在天空飛行");
    }

    @Override
    void stop(){
        System.out.println("飛機降落");
    }
    
}
