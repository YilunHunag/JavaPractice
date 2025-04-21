package JavaPractice;

import java.time.LocalDateTime;

public class NotificationTest {
    public static void main(String[] args) {
        // 通知一：存款成功
        DepositInfo deposit = new DepositInfo("ACC123", 5000);
        Notification<DepositInfo> depositNote = new Notification<>(
            deposit, "INFO", LocalDateTime.now()
        );

        // 通知二：異常登入警告
        LoginAlert alert = new LoginAlert("192.168.0.1", "台北", "Chrome on Windows");
        Notification<LoginAlert> loginAlert = new Notification<>(
            alert, "WARNING", LocalDateTime.now()
        );

        // 通知三：系統公告（純文字）
        Notification<String> systemNote = new Notification<>(
            "系統將於今晚 11:00 ~ 1:00 進行維護", "NOTICE", LocalDateTime.now()
        );

        // 印出所有通知
        System.out.println(depositNote);
        System.out.println(loginAlert);
        System.out.println(systemNote);
    }
}
