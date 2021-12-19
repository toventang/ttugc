package com.p2082ss.android.ugc.aweme.filter.repository.p2986a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.c */
public final class C50695c {

    /* renamed from: a */
    public final List<C50698f> f117039a;

    /* renamed from: b */
    public final List<C89378p<EffectCategoryResponse, List<C50698f>>> f117040b;

    static {
        Covode.recordClassIndex(59857);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50695c)) {
            return false;
        }
        C50695c cVar = (C50695c) obj;
        return C89219l.m154714a(this.f117039a, cVar.f117039a) && C89219l.m154714a(this.f117040b, cVar.f117040b);
    }

    public final int hashCode() {
        List<C50698f> list = this.f117039a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C89378p<EffectCategoryResponse, List<C50698f>>> list2 = this.f117040b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FilterData(filters=" + this.f117039a + ", filterTable=" + this.f117040b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C50695c(List<C50698f> list, List<? extends C89378p<EffectCategoryResponse, ? extends List<C50698f>>> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f117039a = list;
        this.f117040b = list2;
    }
}
