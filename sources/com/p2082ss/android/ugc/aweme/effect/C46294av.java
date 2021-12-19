package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.AbstractC85541q;
import dmt.p4542av.video.C88292p;

/* renamed from: com.ss.android.ugc.aweme.effect.av */
final /* synthetic */ class C46294av implements AbstractC85541q {

    /* renamed from: a */
    private final C46267ac f107931a;

    static {
        Covode.recordClassIndex(54871);
    }

    C46294av(C46267ac acVar) {
        this.f107931a = acVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85541q
    public final void onCallback(int i, int i2, float f, String str) {
        C46267ac acVar = this.f107931a;
        if (i == 4098) {
            C88292p value = acVar.f107876d.getValue();
            if (!acVar.f107850K) {
                return;
            }
            if (value == null || value.f200341g != 0) {
                acVar.f107880h.post(new RunnableC46298az(acVar));
            }
        }
    }
}
