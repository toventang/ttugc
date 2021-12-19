package com.bytedance.creativex.recorder.filter.p944c;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50691c;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import p4600h.C89378p;

/* renamed from: com.bytedance.creativex.recorder.filter.c.b */
public final class C14240b {
    static {
        Covode.recordClassIndex(16309);
    }

    /* renamed from: a */
    public static final String m25980a(C89378p<? extends FilterBean, C14215e> pVar) {
        EffectCategoryResponse b;
        if (pVar == null || (b = C50691c.m94991b(pVar.getSecond().f34498b.mo86071f(), (FilterBean) pVar.getFirst())) == null) {
            return null;
        }
        return b.getName();
    }
}
