package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct */
public class WelcomePageTextStruct {
    @AbstractC27891c(mo46611a = "description")
    private String description;
    @AbstractC27891c(mo46611a = "image_url")
    private String imageUrl;
    @AbstractC27891c(mo46611a = "page_num")
    private Integer pageNum;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(62431);
    }

    public String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getImageUrl() {
        String str = this.imageUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getPageNum() {
        Integer num = this.pageNum;
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
