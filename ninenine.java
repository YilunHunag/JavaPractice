package JavaPractice;

public class ninenine {
    public static void main(String[] args){
        for (int i =1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.println(i + "x" + j + "=" + (i*j) + " ");
                // println會換行, print不會
            }
            System.out.println(); // 換行  
        }
    }
}
