package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.m */
final /* synthetic */ class C52140m implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120134a;

    static {
        Covode.recordClassIndex(61521);
    }

    C52140m(C52125f fVar) {
        this.f120134a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52125f fVar = this.f120134a;
        if (fVar.f120072K) {
            C0692e<Long, Long> playBoundary = fVar.f120114x.getPlayBoundary();
            F f = playBoundary.f2750a;
            S s = playBoundary.f2751b;
            if (f != null && s != null) {
                fVar.f120095e.setValue(C88296t.m153438b(fVar.f120063B.mo78733a((long) f.intValue())));
                fVar.mo87844a((long) f.intValue(), (long) s.intValue());
            }
        }
    }
}
