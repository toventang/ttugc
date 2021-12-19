package com.p2082ss.android.ugc.aweme.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* renamed from: com.ss.android.ugc.aweme.effect.aj */
final /* synthetic */ class C46282aj implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107917a;

    static {
        Covode.recordClassIndex(54859);
    }

    C46282aj(C46267ac acVar) {
        this.f107917a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        F f;
        C46267ac acVar = this.f107917a;
        if (acVar.f107850K && (f = acVar.f107896x.getPlayBoundary().f2750a) != null) {
            acVar.f107877e.setValue(C88296t.m153436a(acVar.f107841B.mo78733a((long) f.intValue())));
            acVar.mo78763g();
        }
    }
}
