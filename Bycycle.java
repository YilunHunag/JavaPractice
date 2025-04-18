package JavaPractice;

public class Bycycle extends Vehicle{
    
    @Override
    void move(){
        System.out.println("腳踏車移動");
    }
    
    @Override
    void stop(){
        System.out.println("腳踏車停下來");
    }
}
