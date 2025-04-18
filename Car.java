package JavaPractice;

public class Car extends Vehicle {

    @Override
    void move(){
        System.out.println("汽車移動");
    }

    @Override
    void stop(){
        System.out.println("汽車停下來");
    }
    
}
