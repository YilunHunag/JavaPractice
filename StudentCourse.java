package JavaPractice;

import java.util.*;

public class StudentCourse {

    public static void main(String[] args) {
        
        // LinkedHashMap 根據輸入順序
        Map <String, Set<String>> CrsMap = new LinkedHashMap<>();
        CrsMap.put("Amy", new HashSet<>(Arrays.asList("數學", "英文", "物理")));
        CrsMap.put("Bob", new HashSet<>(Arrays.asList("數學", "化學")));
        CrsMap.put("Candy", new HashSet<>(Arrays.asList("數學", "英文", "物理", "化學", "地理")));

        // 列出每位學生的課程
        for(Map.Entry<String, Set<String>>entry: CrsMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
        // TreeMap 根據字母排序
        Map<String, Set<String>> studentCourses = new TreeMap<>();
        studentCourses.put("Alice", new HashSet<>(Arrays.asList("Math", "English")));
        studentCourses.put("Charlie", new HashSet<>(Arrays.asList("History")));
        studentCourses.put("Bob", new HashSet<>(Arrays.asList("Science", "Art")));

        // 列出每位學生的課程
        for(Map.Entry<String, Set<String>>entry: studentCourses.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    
}
