package com.p2082ss.android.ugc.aweme.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import dmt.p4542av.video.C88296t;

/* renamed from: com.ss.android.ugc.aweme.effect.ao */
final /* synthetic */ class C46287ao implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107922a;

    static {
        Covode.recordClassIndex(54864);
    }

    C46287ao(C46267ac acVar) {
        this.f107922a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107922a;
        Long l = (Long) obj;
        if (acVar.f107850K && l != null) {
            long a = acVar.f107841B.mo78733a(l.longValue());
            acVar.f107877e.setValue(C88296t.m153436a(a));
            acVar.f107854O.f108010a = a;
            acVar.f107854O.f108011b = l.longValue();
            acVar.mo78745a(l.intValue(), true);
        }
    }
}
