package com.p2082ss.android.ugc.aweme.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* renamed from: com.ss.android.ugc.aweme.effect.ah */
final /* synthetic */ class C46280ah implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107915a;

    static {
        Covode.recordClassIndex(54857);
    }

    C46280ah(C46267ac acVar) {
        this.f107915a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        S s;
        C46267ac acVar = this.f107915a;
        if (acVar.f107850K && (s = acVar.f107896x.getPlayBoundary().f2751b) != null) {
            acVar.f107877e.setValue(C88296t.m153436a(acVar.f107841B.mo78733a((long) s.intValue())));
            acVar.mo78763g();
        }
    }
}
