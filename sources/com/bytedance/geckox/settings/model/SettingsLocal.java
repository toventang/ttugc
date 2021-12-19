package com.bytedance.geckox.settings.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class SettingsLocal {
    @AbstractC27891c(mo46611a = "app_version")
    private String appVersion;
    @AbstractC27891c(mo46611a = "env")
    private String env;

    static {
        Covode.recordClassIndex(17177);
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getEnv() {
        return this.env;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setEnv(String str) {
        this.env = str;
    }

    public SettingsLocal(String str, String str2) {
        this.env = str;
        this.appVersion = str2;
    }
}
