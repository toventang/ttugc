package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.AbstractC85541q;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.g */
public final /* synthetic */ class C72000g implements AbstractC85541q {

    /* renamed from: a */
    private final C71993c f161355a;

    static {
        Covode.recordClassIndex(84640);
    }

    C72000g(C71993c cVar) {
        this.f161355a = cVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85541q
    public final void onCallback(int i, int i2, float f, String str) {
        C71993c cVar = this.f161355a;
        if (i != 4101) {
            return;
        }
        if (cVar.f161329c.size() >= cVar.f161330d) {
            cVar.f161336j.sendEmptyMessage(1003);
        } else {
            cVar.f161334h.sendEmptyMessage(1001);
        }
    }
}
