package com.p2082ss.android.ugc.aweme.effect;

import androidx.core.p036g.C0692e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65375bo;
import dmt.p4542av.video.C88296t;

/* renamed from: com.ss.android.ugc.aweme.effect.ak */
final /* synthetic */ class C46283ak implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107918a;

    static {
        Covode.recordClassIndex(54860);
    }

    C46283ak(C46267ac acVar) {
        this.f107918a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107918a;
        if (acVar.f107850K) {
            C0692e<Long, Long> playBoundary = acVar.f107896x.getPlayBoundary();
            F f = playBoundary.f2750a;
            S s = playBoundary.f2751b;
            if (f != null && s != null) {
                if (!C65375bo.m117071a()) {
                    acVar.f107877e.setValue(C88296t.m153438b(acVar.f107841B.mo78733a((long) f.intValue())));
                }
                acVar.mo78747a((long) f.intValue(), (long) s.intValue(), true);
            }
        }
    }
}
