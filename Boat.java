package JavaPractice;

public class Boat extends Vehicle{

    @Override
    void move(){
        System.out.println("船在海上航行");
    }

    @Override
    void stop(){
        System.out.println("船靠岸停下來");
    }
}
