package JavaPractice;

public class Bycycle extends Vehicle{
    
    Bycycle(){
        super(2);
    }
    
    @Override
    public String getVehicleType() {
        return "這台腳踏車有 ";
    }
    
    @Override
    public void move(){
        System.out.println("腳踏車移動");
    }
    
    @Override
    void stop(){
        System.out.println("腳踏車停下來");
    }
}
