package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DownloadSettings */
public class DownloadSettings {
    @AbstractC27891c(mo46611a = "download_dialog_config")
    private DownloadDialogSettings downloadDialogConfig;
    @AbstractC27891c(mo46611a = "download_lib_switch")
    private Integer downloadLibSwitch;

    static {
        Covode.recordClassIndex(62346);
    }

    public DownloadDialogSettings getDownloadDialogConfig() {
        DownloadDialogSettings downloadDialogSettings = this.downloadDialogConfig;
        if (downloadDialogSettings != null) {
            return downloadDialogSettings;
        }
        throw new C16041a();
    }

    public Integer getDownloadLibSwitch() {
        Integer num = this.downloadLibSwitch;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
