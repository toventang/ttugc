package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DeviceInfo */
public class DeviceInfo {
    @AbstractC27891c(mo46611a = "brand")
    private String brand;
    @AbstractC27891c(mo46611a = "device")
    private String device;
    @AbstractC27891c(mo46611a = "model")
    private String model;

    static {
        Covode.recordClassIndex(62343);
    }

    public String getBrand() {
        String str = this.brand;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getDevice() {
        String str = this.device;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getModel() {
        String str = this.model;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
