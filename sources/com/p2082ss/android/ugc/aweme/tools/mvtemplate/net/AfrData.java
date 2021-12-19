package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrData */
public final class AfrData {
    private String algorithm = "";
    @AbstractC27891c(mo46611a = "pic_conf")
    private String jsonResult = "";
    private String pic;

    static {
        Covode.recordClassIndex(92125);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final String getPic() {
        return this.pic;
    }

    public final void setPic(String str) {
        this.pic = str;
    }

    public final void setAlgorithm(String str) {
        C89219l.m154721d(str, "");
        this.algorithm = str;
    }

    public final void setJsonResult(String str) {
        C89219l.m154721d(str, "");
        this.jsonResult = str;
    }
}
