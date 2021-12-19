package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UserAntiAddiction */
public class UserAntiAddiction {
    @AbstractC27891c(mo46611a = "aweme_id")
    private String awemeId;
    @AbstractC27891c(mo46611a = "popup_text")
    private String popupText;

    static {
        Covode.recordClassIndex(62420);
    }

    public String getAwemeId() {
        String str = this.awemeId;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getPopupText() {
        String str = this.popupText;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
