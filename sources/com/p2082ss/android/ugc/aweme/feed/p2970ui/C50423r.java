package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.r */
final /* synthetic */ class C50423r implements AbstractC89183m {

    /* renamed from: a */
    private final C50403p f116420a;

    static {
        Covode.recordClassIndex(59556);
    }

    C50423r(C50403p pVar) {
        this.f116420a = pVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        C50403p pVar = this.f116420a;
        Float f = (Float) obj2;
        boolean z = true;
        if (Math.abs(f.floatValue()) <= Math.abs(((Float) obj).floatValue()) || (f.floatValue() >= 0.0f && pVar.f116377q.f114770Y == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
