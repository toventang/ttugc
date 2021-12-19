package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.n */
final /* synthetic */ class C52141n implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120135a;

    static {
        Covode.recordClassIndex(61522);
    }

    C52141n(C52125f fVar) {
        this.f120135a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        F f;
        C52125f fVar = this.f120135a;
        if (fVar.f120072K && (f = fVar.f120114x.getPlayBoundary().f2750a) != null) {
            fVar.f120095e.setValue(C88296t.m153436a(fVar.f120063B.mo78733a((long) f.intValue())));
            fVar.mo87858e();
        }
    }
}
