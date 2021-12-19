package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WatermarkStruct */
public class WatermarkStruct {
    @AbstractC27891c(mo46611a = "end_watermark_string")
    private String endWatermarkString;
    @AbstractC27891c(mo46611a = "end_watermark_substring")
    private String endWatermarkSubstring;
    @AbstractC27891c(mo46611a = "fps")
    private String fps;
    @AbstractC27891c(mo46611a = "md5")
    private String md5;
    @AbstractC27891c(mo46611a = "resource_url")
    private UrlModel resourceUrl;

    static {
        Covode.recordClassIndex(62430);
    }

    public String getEndWatermarkString() {
        String str = this.endWatermarkString;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getEndWatermarkSubstring() {
        String str = this.endWatermarkSubstring;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getFps() {
        String str = this.fps;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getMd5() {
        String str = this.md5;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C16041a();
    }
}
