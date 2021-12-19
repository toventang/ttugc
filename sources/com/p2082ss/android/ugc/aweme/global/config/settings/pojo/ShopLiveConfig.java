package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ShopLiveConfig */
public class ShopLiveConfig {
    @AbstractC27891c(mo46611a = "merch_picker_url")
    private String merchPickerUrl;

    static {
        Covode.recordClassIndex(62391);
    }

    public String getMerchPickerUrl() {
        String str = this.merchPickerUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
