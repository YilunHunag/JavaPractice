package JavaPractice;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class TryCatchErrorLogger {
    public static void main(String[] args) {
        try {
            // 模擬錯誤（除以 0）
            int result = 10 / 0;
            System.out.println("結果：" + result);
        } catch (Exception e) {
            logError(e);
        }

        System.out.println("程式繼續執行...");
    }

    public static void logError(Exception e) {
        try {
            FileWriter writer = new FileWriter("error.log", true); // true 表示 append 模式
            writer.write("發生時間：" + LocalDateTime.now() + "\n");
            writer.write("錯誤訊息：" + e.toString() + "\n\n");
            writer.close();
            System.out.println("錯誤已記錄至 error.log");
        } catch (IOException ioException) {
            System.out.println("寫入錯誤日誌失敗：" + ioException.getMessage());
        }
    }
}

