package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.QuickShopLoadingPage */
public class QuickShopLoadingPage {
    @AbstractC27891c(mo46611a = "background_url")
    private String backgroundUrl;
    @AbstractC27891c(mo46611a = "text_pic_url")
    private String textPicUrl;

    static {
        Covode.recordClassIndex(62385);
    }

    public String getBackgroundUrl() {
        String str = this.backgroundUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getTextPicUrl() {
        String str = this.textPicUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
