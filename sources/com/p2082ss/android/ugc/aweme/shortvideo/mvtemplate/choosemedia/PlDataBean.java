package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PlDataBean */
public final class PlDataBean implements Serializable {
    private List<String> alg = new ArrayList();
    private boolean guide;
    private boolean loading;
    private String relation;

    static {
        Covode.recordClassIndex(84712);
    }

    public final List<String> getAlg() {
        return this.alg;
    }

    public final boolean getGuide() {
        return this.guide;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final void setGuide(boolean z) {
        this.guide = z;
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final void setRelation(String str) {
        this.relation = str;
    }

    public final void setAlg(List<String> list) {
        C89219l.m154721d(list, "");
        this.alg = list;
    }
}
