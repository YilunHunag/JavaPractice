package JavaPractice;

import JavaPractice.Capabilities.*;

abstract class Vehicle implements Moveable, Fuelable{
    int wheels;
    public abstract String getVehicleType();
    Vehicle(int wheels){
        this.wheels = wheels;
    }
    void showWheels() {
        System.out.println(getVehicleType() + wheels + " 個輪子");
    }

    // 抽象方法
    public abstract void move();
    abstract void stop();

    // 一般方法: 共通功能
    public void fuel(String fuelType){
        System.out.println("加" + fuelType + "中...");
    }
}
