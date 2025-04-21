package JavaPractice;

import java.util.*;

public class StudentScoreSystem {

    public static void main(String[] args) {
        
        // 建立Map
        Map<String, List<Integer>> scoreMap = new HashMap<>();

        // 加入學生資料
        scoreMap.put("小明", Arrays.asList(80,90,100));
        scoreMap.put("小華", Arrays.asList(70,75,60));
        scoreMap.put("小美", Arrays.asList(80,90));

        // 平均成績
        for(String student: scoreMap.keySet()){
            List<Integer> scores = scoreMap.get(student);
            double average = calculateAverage(scores);
            System.out.println(student + " 的平均成績是 " + average);
        }
    }
    // 計算平均分數
    public static double calculateAverage(List<Integer> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.size();
    }

}
