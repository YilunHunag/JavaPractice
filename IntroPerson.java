package JavaPractice;

public class IntroPerson {
    // 主要方法

    public static void main(String[] args){
        
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
    
        person1.setName("小華");
        person2.setName("小明");
        person3.setName("小丑");
        
        person1.setAge(18);
        person2.setAge(25);
        person3.setAge(36);
    
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.introduce();
        person2.introduce();
        person3.introduce();
    }
}
