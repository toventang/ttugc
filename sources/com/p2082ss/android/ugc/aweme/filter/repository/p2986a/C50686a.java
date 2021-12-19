package com.p2082ss.android.ugc.aweme.filter.repository.p2986a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a */
public final class C50686a {

    /* renamed from: a */
    public final List<C50694b> f117025a;

    /* renamed from: b */
    public final List<C89378p<EffectCategoryModel, List<C50694b>>> f117026b;

    static {
        Covode.recordClassIndex(59848);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50686a)) {
            return false;
        }
        C50686a aVar = (C50686a) obj;
        return C89219l.m154714a(this.f117025a, aVar.f117025a) && C89219l.m154714a(this.f117026b, aVar.f117026b);
    }

    public final int hashCode() {
        List<C50694b> list = this.f117025a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<C89378p<EffectCategoryModel, List<C50694b>>> list2 = this.f117026b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FilterBoxData(metas=" + this.f117025a + ", table=" + this.f117026b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, ? extends java.util.List<com.ss.android.ugc.aweme.filter.repository.a.b>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C50686a(List<C50694b> list, List<? extends C89378p<EffectCategoryModel, ? extends List<C50694b>>> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f117025a = list;
        this.f117026b = list2;
    }
}
