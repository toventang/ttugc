package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.ag */
final /* synthetic */ class C52105ag implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120027a;

    static {
        Covode.recordClassIndex(61486);
    }

    C52105ag(C52125f fVar) {
        this.f120027a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52125f fVar = this.f120027a;
        Boolean bool = (Boolean) obj;
        if (fVar.f120063B != null && bool != null) {
            fVar.f120063B.mo78734a(bool.booleanValue());
            fVar.f120076O.mo78830a(fVar.f120062A.mo56368j(), fVar.f120062A.mo56246G());
        }
    }
}
