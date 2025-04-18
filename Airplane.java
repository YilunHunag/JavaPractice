package JavaPractice;

public class Airplane extends Vehicle{
    
    @Override
    void move(){
        System.out.println("飛機在天空飛行");
    }

    @Override
    void stop(){
        System.out.println("飛機降落");
    }
    
}
