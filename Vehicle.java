package JavaPractice;

abstract class Vehicle {
    // 抽象方法
    abstract void move();
    abstract void stop();

    // 一般方法: 共通功能
    void fuel(String fuelType){
        System.out.println("加" + fuelType + "中...");
    }
}
