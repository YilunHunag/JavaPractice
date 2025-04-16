package JavaProject;

import java.util.Scanner;

public class inputDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("請輸入你的年齡");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("請輸入你的名字");
        String name = input.nextLine();

        System.out.println("你好, " + name + ", 你今年" + age +"歲。");
        input.close();
    }
    
}
