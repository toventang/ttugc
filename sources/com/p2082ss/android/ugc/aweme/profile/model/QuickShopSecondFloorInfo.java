package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.QuickShopSecondFloorInfo */
public class QuickShopSecondFloorInfo implements Serializable {
    @AbstractC27891c(mo46611a = "enter_text")
    public String enterText;
    @AbstractC27891c(mo46611a = "process_text")
    public String processText;
    @AbstractC27891c(mo46611a = "trans_bg_text")
    public String transBgText;

    static {
        Covode.recordClassIndex(75201);
    }

    public String getEnterText() {
        return this.enterText;
    }

    public String getProcessText() {
        return this.processText;
    }

    public String getTransBgText() {
        return this.transBgText;
    }

    public void setEnterText(String str) {
        this.enterText = str;
    }

    public void setProcessText(String str) {
        this.processText = str;
    }

    public void setTransBgText(String str) {
        this.transBgText = str;
    }
}
