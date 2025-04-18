package JavaPractice;

public class Cat extends Animal {
    // 建構子, super呼叫父類別的建構子
    public Cat(String name){
        super(name);
    }

    public void meow(){
        System.out.println("喵喵!");
    }

    @Override
    public void makeSound(){
        System.out.println("貓貓喵喵叫！");
    }
}
