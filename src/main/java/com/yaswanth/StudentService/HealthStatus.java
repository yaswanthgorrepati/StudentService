package com.yaswanth.StudentService;

public class HealthStatus {

    private String health;
    private String appVersion;

    public HealthStatus() {
    }

    public HealthStatus(String health, String appVersion) {
        this.health = health;
        this.appVersion = appVersion;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
