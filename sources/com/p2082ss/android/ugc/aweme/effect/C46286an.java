package com.p2082ss.android.ugc.aweme.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.effect.an */
final /* synthetic */ class C46286an implements AbstractC1214u {

    /* renamed from: a */
    private final C46267ac f107921a;

    static {
        Covode.recordClassIndex(54863);
    }

    C46286an(C46267ac acVar) {
        this.f107921a = acVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C46267ac acVar = this.f107921a;
        Boolean bool = (Boolean) obj;
        if (acVar.f107850K && bool != null && bool.booleanValue()) {
            acVar.mo78768l();
        }
    }
}
