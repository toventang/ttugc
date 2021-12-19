package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.p */
final /* synthetic */ class C52143p implements AbstractC1214u {

    /* renamed from: a */
    private final C52125f f120137a;

    static {
        Covode.recordClassIndex(61524);
    }

    C52143p(C52125f fVar) {
        this.f120137a = fVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C52125f fVar = this.f120137a;
        Boolean bool = (Boolean) obj;
        if (fVar.f120072K && bool != null && bool.booleanValue()) {
            fVar.mo87863j();
        }
    }
}
