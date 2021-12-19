package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage */
public class AppStoreMessage {
    @AbstractC27891c(mo46611a = "section")
    private Integer section;
    @AbstractC27891c(mo46611a = "switcher")
    private Integer switcher = 1;
    @AbstractC27891c(mo46611a = "text")
    private String text;
    @AbstractC27891c(mo46611a = "threshold")
    private Integer threshold;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(62328);
    }

    public Integer getSection() {
        Integer num = this.section;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getSwitcher() {
        Integer num = this.switcher;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getThreshold() {
        Integer num = this.threshold;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
