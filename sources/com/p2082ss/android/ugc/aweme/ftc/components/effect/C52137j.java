package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.j */
final /* synthetic */ class C52137j implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120131a;

    static {
        Covode.recordClassIndex(61518);
    }

    C52137j(C52125f fVar) {
        this.f120131a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        S s;
        C52125f fVar = this.f120131a;
        if (fVar.f120072K && (s = fVar.f120114x.getPlayBoundary().f2751b) != null) {
            fVar.f120095e.setValue(C88296t.m153436a(fVar.f120063B.mo78733a((long) s.intValue())));
            fVar.mo87858e();
        }
    }
}
