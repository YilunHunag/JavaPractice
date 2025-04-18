package JavaPractice;

public class Animal {
    private String name;
    // 用建構子初始化資料
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void makeSound(){
        System.out.println("發出聲音");
    }

}
