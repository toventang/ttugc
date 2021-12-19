package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.AbstractC85541q;
import dmt.p4542av.video.C88292p;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.x */
final /* synthetic */ class C52151x implements AbstractC85541q {

    /* renamed from: a */
    private final C52125f f120145a;

    static {
        Covode.recordClassIndex(61532);
    }

    C52151x(C52125f fVar) {
        this.f120145a = fVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85541q
    public final void onCallback(int i, int i2, float f, String str) {
        C52125f fVar = this.f120145a;
        if (i == 4098) {
            C88292p value = fVar.f120094d.getValue();
            if (!fVar.f120072K) {
                return;
            }
            if (value == null || value.f200341g != 0) {
                fVar.f120098h.post(new RunnableC52100ab(fVar));
            }
        }
    }
}
