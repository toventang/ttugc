package com.bytedance.geckox.model;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class Common {
    @AbstractC27891c(mo46611a = "ac")

    /* renamed from: ac */
    public String f36579ac;
    @AbstractC27891c(mo46611a = "aid")
    public long aid;
    @AbstractC27891c(mo46611a = "app_name")
    public String appName;
    @AbstractC27891c(mo46611a = "app_version")
    public String appVersion;
    @AbstractC27891c(mo46611a = "device_id")
    public String deviceId;
    @AbstractC27891c(mo46611a = "device_model")
    public String deviceModel = Build.MODEL;
    @AbstractC27891c(mo46611a = "device_platform")
    public String devicePlatform = "android";
    @AbstractC27891c(mo46611a = "os")

    /* renamed from: os */
    public int f36580os;
    @AbstractC27891c(mo46611a = "os_version")
    public String osVersion = new StringBuilder().append(Build.VERSION.SDK_INT).toString();
    @AbstractC27891c(mo46611a = "region")
    public String region;
    @AbstractC27891c(mo46611a = "sdk_version")
    public String sdkVersion = "3.0.0-rc.0-mt";

    static {
        Covode.recordClassIndex(17102);
    }

    public Common(long j, String str, String str2, String str3) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.region = str3;
    }

    public Common(long j, String str, String str2, String str3, String str4) {
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f36579ac = str4;
    }
}
