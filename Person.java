package JavaPractice;

public class Person {
    // 封裝
    private String name;
    private int age;
    // 定義封裝後調整數值的方法
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("年齡不能為負數!");
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // 定義方法(行為)
    public void introduce(){
        System.out.println("Hello, 我叫做"+ name + "今年" + age + "歲");
    }
}


