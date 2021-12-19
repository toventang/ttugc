package com.p2082ss.android.ugc.aweme.shortvideo.countdown;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.h */
final /* synthetic */ class C69972h extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f156390a = new C69972h();

    static {
        Covode.recordClassIndex(82383);
    }

    C69972h() {
        super(CountdownState.class, "maxDuration", "getMaxDuration()J", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Long.valueOf(((CountdownState) obj).getMaxDuration());
    }
}
