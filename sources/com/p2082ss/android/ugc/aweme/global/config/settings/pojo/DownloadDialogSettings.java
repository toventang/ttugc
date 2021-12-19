package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadDialogSettings */
public class DownloadDialogSettings {
    @AbstractC27891c(mo46611a = "is_enable_back_dialog")
    private Integer isEnableBackDialog;

    static {
        Covode.recordClassIndex(62345);
    }

    public Integer getIsEnableBackDialog() {
        Integer num = this.isEnableBackDialog;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
