package com.p2082ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specialplus.SpecialPlusMedia */
public final class SpecialPlusMedia {
    @AbstractC27891c(mo46611a = "md5")
    private String md5 = "";
    @AbstractC27891c(mo46611a = "url")
    private String url = "";

    static {
        Covode.recordClassIndex(88083);
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setMd5(String str) {
        C89219l.m154721d(str, "");
        this.md5 = str;
    }

    public final void setUrl(String str) {
        C89219l.m154721d(str, "");
        this.url = str;
    }
}
