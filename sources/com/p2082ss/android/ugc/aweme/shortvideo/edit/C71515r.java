package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.r */
public final class C71515r implements Serializable {
    @AbstractC27891c(mo46611a = "code")

    /* renamed from: a */
    private Integer f160276a = 0;
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: b */
    private String f160277b = "highlight";
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: c */
    private String f160278c = "draft";

    static {
        Covode.recordClassIndex(84056);
    }

    public final Integer getCode() {
        return this.f160276a;
    }

    public final String getStatus() {
        return this.f160278c;
    }

    public final String getType() {
        return this.f160277b;
    }

    public final void setCode(Integer num) {
        this.f160276a = num;
    }

    public final void setStatus(String str) {
        this.f160278c = str;
    }

    public final void setType(String str) {
        this.f160277b = str;
    }
}
