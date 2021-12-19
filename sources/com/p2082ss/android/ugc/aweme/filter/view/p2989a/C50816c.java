package com.p2082ss.android.ugc.aweme.filter.view.p2989a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.view.a.c */
public final class C50816c {

    /* renamed from: a */
    public final EnumC50817d f117264a;

    /* renamed from: b */
    public final EffectCategoryResponse f117265b;

    /* renamed from: c */
    public final FilterBean f117266c;

    static {
        Covode.recordClassIndex(59987);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50816c)) {
            return false;
        }
        C50816c cVar = (C50816c) obj;
        return C89219l.m154714a(this.f117264a, cVar.f117264a) && C89219l.m154714a(this.f117265b, cVar.f117265b) && C89219l.m154714a(this.f117266c, cVar.f117266c);
    }

    public final int hashCode() {
        EnumC50817d dVar = this.f117264a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        EffectCategoryResponse effectCategoryResponse = this.f117265b;
        int hashCode2 = (hashCode + (effectCategoryResponse != null ? effectCategoryResponse.hashCode() : 0)) * 31;
        FilterBean filterBean = this.f117266c;
        if (filterBean != null) {
            i = filterBean.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "FilterViewActionEvent(type=" + this.f117264a + ", extraTab=" + this.f117265b + ", extraFilter=" + this.f117266c + ")";
    }

    private C50816c(EnumC50817d dVar, EffectCategoryResponse effectCategoryResponse, FilterBean filterBean) {
        C89219l.m154721d(dVar, "");
        this.f117264a = dVar;
        this.f117265b = effectCategoryResponse;
        this.f117266c = filterBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C50816c(EnumC50817d dVar, EffectCategoryResponse effectCategoryResponse, FilterBean filterBean, int i) {
        this(dVar, (i & 2) != 0 ? null : effectCategoryResponse, (i & 4) != 0 ? null : filterBean);
    }
}
