package JavaPractice;

public class Scooter extends Vehicle{

    @Override
    void move(){
        System.out.println("摩托車移動");
    }
    
    @Override
    void stop(){
        System.out.println("摩托車停下來");
    }
    
}
