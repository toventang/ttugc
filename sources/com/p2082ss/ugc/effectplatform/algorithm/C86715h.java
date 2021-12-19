package com.p2082ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.C86843g;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.algorithm.h */
public final class C86715h {

    /* renamed from: a */
    public C86843g f195546a;

    /* renamed from: b */
    public ModelInfo f195547b;

    static {
        Covode.recordClassIndex(102414);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C86715h)) {
            return false;
        }
        C86715h hVar = (C86715h) obj;
        return C89219l.m154714a(this.f195546a, hVar.f195546a) && C89219l.m154714a(this.f195547b, hVar.f195547b);
    }

    public final int hashCode() {
        C86843g gVar = this.f195546a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        ModelInfo modelInfo = this.f195547b;
        if (modelInfo != null) {
            i = modelInfo.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ModelInfoCache(localModelInfo=" + this.f195546a + ", serverModelInfo=" + this.f195547b + ")";
    }

    public C86715h(C86843g gVar, ModelInfo modelInfo) {
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(modelInfo, "");
        this.f195546a = gVar;
        this.f195547b = modelInfo;
    }
}
