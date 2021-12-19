package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo */
public final class SdkExtraInfo implements Serializable {
    private String mvAlgorithmHint = "";

    /* renamed from: pl */
    private PlDataBean f161489pl;

    static {
        Covode.recordClassIndex(84715);
    }

    public final String getMvAlgorithmHint() {
        return this.mvAlgorithmHint;
    }

    public final PlDataBean getPl() {
        return this.f161489pl;
    }

    public final boolean isLegal() {
        PlDataBean plDataBean;
        List<String> alg;
        if (this.mvAlgorithmHint.length() <= 0 || (plDataBean = this.f161489pl) == null || (alg = plDataBean.getAlg()) == null || !(!alg.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void setPl(PlDataBean plDataBean) {
        this.f161489pl = plDataBean;
    }

    public final void setMvAlgorithmHint(String str) {
        C89219l.m154721d(str, "");
        this.mvAlgorithmHint = str;
    }
}
