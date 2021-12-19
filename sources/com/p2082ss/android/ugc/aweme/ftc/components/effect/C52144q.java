package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.q */
final /* synthetic */ class C52144q implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120138a;

    static {
        Covode.recordClassIndex(61525);
    }

    C52144q(C52125f fVar) {
        this.f120138a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52125f fVar = this.f120138a;
        Long l = (Long) obj;
        if (fVar.f120072K && l != null) {
            long a = fVar.f120063B.mo78733a(l.longValue());
            fVar.f120095e.setValue(C88296t.m153436a(a));
            fVar.f120076O.f108010a = a;
            fVar.f120076O.f108011b = l.longValue();
            fVar.mo87843a(l.intValue(), true);
        }
    }
}
