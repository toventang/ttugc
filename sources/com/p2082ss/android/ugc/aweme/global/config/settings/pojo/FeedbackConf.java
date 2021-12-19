package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf */
public class FeedbackConf {
    @AbstractC27891c(mo46611a = "disable_upload_region")
    private String[] disableUploadRegion;
    @AbstractC27891c(mo46611a = "fe_help")
    private String feHelp;
    @AbstractC27891c(mo46611a = "fe_record")
    private String feRecord;
    @AbstractC27891c(mo46611a = "help")
    private String help;
    @AbstractC27891c(mo46611a = "normal_entry")
    private String normalEntry;
    @AbstractC27891c(mo46611a = "not_logged_in")
    private String notLoggedIn;

    static {
        Covode.recordClassIndex(62351);
    }

    public String[] getDisableUploadRegion() {
        String[] strArr = this.disableUploadRegion;
        if (strArr == null) {
            return null;
        }
        return strArr;
    }

    public String getFeHelp() {
        String str = this.feHelp;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getFeRecord() {
        String str = this.feRecord;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getHelp() {
        String str = this.help;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getNormalEntry() {
        String str = this.normalEntry;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getNotLoggedIn() {
        String str = this.notLoggedIn;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
