package com.p2082ss.android.ugc.aweme.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.effect.be */
public final /* synthetic */ class C46319be implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107975a;

    static {
        Covode.recordClassIndex(54896);
    }

    public C46319be(C46267ac acVar) {
        this.f107975a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107975a;
        Boolean bool = (Boolean) obj;
        if (acVar.f107841B != null && bool != null) {
            acVar.f107841B.mo78734a(bool.booleanValue());
            acVar.f107854O.mo78830a(acVar.f107840A.mo56368j(), acVar.f107840A.mo56246G());
        }
    }
}
