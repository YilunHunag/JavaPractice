package JavaPractice;

public class Capabilities {
    // 介面 Moveable，定義移動行為
    public interface Moveable {
        void move();
    }

    // 介面 Fuelable，定義加油行為
    public interface Fuelable {
        void fuel(String fuelType);
    }
}

