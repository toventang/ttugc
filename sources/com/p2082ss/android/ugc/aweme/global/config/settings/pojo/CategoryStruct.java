package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.CategoryStruct */
public class CategoryStruct {
    @AbstractC27891c(mo46611a = "category_id")
    private String categoryId;
    @AbstractC27891c(mo46611a = "category_name")
    private String categoryName;

    static {
        Covode.recordClassIndex(62336);
    }

    public String getCategoryId() {
        String str = this.categoryId;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getCategoryName() {
        String str = this.categoryName;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public CategoryStruct(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }
}
