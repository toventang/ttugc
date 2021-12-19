package com.p2082ss.android.ugc.aweme.ftc.countdown;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.countdown.h */
final /* synthetic */ class C52487h extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f120880a = new C52487h();

    static {
        Covode.recordClassIndex(61883);
    }

    C52487h() {
        super(FTCCountdownState.class, "maxDuration", "getMaxDuration()J", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Long.valueOf(((FTCCountdownState) obj).getMaxDuration());
    }
}
