package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryPageTextStruct */
public class CategoryPageTextStruct {
    @AbstractC27891c(mo46611a = "description")
    private String description;
    @AbstractC27891c(mo46611a = "title")
    private String title;

    static {
        Covode.recordClassIndex(62335);
    }

    public String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
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
