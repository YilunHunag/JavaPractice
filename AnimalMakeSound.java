package JavaPractice;

public class AnimalMakeSound {
    public static void main(String[] args) {
        
        Cat myCat = new Cat("奇奇");

        System.out.println("這隻貓的名字叫" + myCat.getName());
        myCat.makeSound();
        myCat.meow();
    }
    
}
