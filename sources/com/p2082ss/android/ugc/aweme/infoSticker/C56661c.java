package com.p2082ss.android.ugc.aweme.infoSticker;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.infoSticker.c */
public final /* synthetic */ class C56661c implements AbstractC1214u {

    /* renamed from: a */
    private final AbstractC56659a f129135a;

    static {
        Covode.recordClassIndex(66509);
    }

    C56661c(AbstractC56659a aVar) {
        this.f129135a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AbstractC56659a aVar = this.f129135a;
        C35324a aVar2 = (C35324a) obj;
        if (aVar2 != null && aVar2.f83351b == C35324a.EnumC35325a.SUCCESS) {
            aVar.mo93541a(aVar2.f83350a);
        }
    }
}
