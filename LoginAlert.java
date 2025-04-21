package JavaPractice;

public class LoginAlert {
    private String ipAddress;
    private String location;
    private String device;

    public LoginAlert(String ipAddress, String location, String device) {
        this.ipAddress = ipAddress;
        this.location = location;
        this.device = device;
    }

    @Override
    public String toString() {
        return "異常登入警告 - IP: " + ipAddress + ", 地區: " + location + ", 裝置: " + device;
    }
}

