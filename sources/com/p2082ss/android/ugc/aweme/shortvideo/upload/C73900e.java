package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.C71798ef;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73852c;
import com.p2082ss.android.vesdk.AbstractC85541q;
import dmt.p4542av.video.C88303z;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.e */
public final /* synthetic */ class C73900e implements AbstractC85541q {

    /* renamed from: a */
    private final C73852c.C738531 f165918a;

    /* renamed from: b */
    private final SynthetiseResult f165919b;

    /* renamed from: c */
    private final C88303z f165920c;

    static {
        Covode.recordClassIndex(86646);
    }

    C73900e(C73852c.C738531 r1, SynthetiseResult synthetiseResult, C88303z zVar) {
        this.f165918a = r1;
        this.f165919b = synthetiseResult;
        this.f165920c = zVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85541q
    public final void onCallback(int i, int i2, float f, String str) {
        C73852c.C738531 r5 = this.f165918a;
        SynthetiseResult synthetiseResult = this.f165919b;
        C88303z zVar = this.f165920c;
        SynthetiseResult clone = synthetiseResult.clone();
        clone.ret = Math.round(f);
        if (r5.mo46226a((Throwable) new C71798ef("VECompiler failed. type = " + i + " ext = " + i2 + " f = " + f + " msg = " + str, clone))) {
            if (i2 == -214) {
                C65357b.f147489a = true;
            }
            zVar.f200423w.mo56387s();
        }
    }
}
