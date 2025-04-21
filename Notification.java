package JavaPractice;

import java.time.LocalDateTime;

public class Notification<T> {
    private T content;
    private String level;
    private LocalDateTime timestamp;

    // 建構子
    public Notification(T content, String level, LocalDateTime timestamp){
        this.content = content;
        this.level = level;
        this.timestamp = timestamp;
    }
    // getter
    public T getContent(){
        return content;
    }

    public String getLevel(){
        return level;
    }
    public LocalDateTime getTimestamp(){
        return timestamp;
    }

    @Override
    public String toString(){
        return "[" + level + "]" + timestamp + "-" + content.toString();
    }

}
