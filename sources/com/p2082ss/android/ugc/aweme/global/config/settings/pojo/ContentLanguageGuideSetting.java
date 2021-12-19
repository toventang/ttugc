package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ContentLanguageGuideSetting */
public class ContentLanguageGuideSetting {
    @AbstractC27891c(mo46611a = "code")
    private String code;
    @AbstractC27891c(mo46611a = "en_name")
    private String enName;
    @AbstractC27891c(mo46611a = "highlight_color")
    private String highlightColor;
    @AbstractC27891c(mo46611a = "icon")
    private String icon;
    @AbstractC27891c(mo46611a = "local_name")
    private String localName;

    static {
        Covode.recordClassIndex(62342);
    }

    public String getCode() {
        String str = this.code;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getEnName() {
        String str = this.enName;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getHighlightColor() {
        String str = this.highlightColor;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getIcon() {
        String str = this.icon;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getLocalName() {
        String str = this.localName;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
