package com.bytedance.falconx.statistic;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class Common {
    @AbstractC27891c(mo46611a = "app_version")
    public String appVersion;
    @AbstractC27891c(mo46611a = "device_id")
    public String deviceId;
    @AbstractC27891c(mo46611a = "device_model")
    public String deviceModel = Build.MODEL;
    @AbstractC27891c(mo46611a = "os")

    /* renamed from: os */
    public int f35237os;
    @AbstractC27891c(mo46611a = "region")
    public String region;
    @AbstractC27891c(mo46611a = "sdk_version")
    public String sdkVersion = "3.0.0-rc.0-mt";

    static {
        Covode.recordClassIndex(16659);
    }
}
