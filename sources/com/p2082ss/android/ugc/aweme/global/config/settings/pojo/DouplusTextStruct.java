package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DouplusTextStruct */
public class DouplusTextStruct {
    @AbstractC27891c(mo46611a = "title")
    private String title;
    @AbstractC27891c(mo46611a = StringSet.type)
    private Integer type;

    static {
        Covode.recordClassIndex(62344);
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getType() {
        Integer num = this.type;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }
}
