package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.dx */
public final /* synthetic */ class C70749dx implements AbstractC89172b {

    /* renamed from: a */
    private final C70748dw f158367a;

    /* renamed from: b */
    private final C14206w f158368b;

    static {
        Covode.recordClassIndex(83220);
    }

    C70749dx(C70748dw dwVar, C14206w wVar) {
        this.f158367a = dwVar;
        this.f158368b = wVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C70748dw dwVar = this.f158367a;
        dwVar.f158361a.runOnUiThread(new RunnableC70750dy(dwVar, (Integer) obj, this.f158368b));
        return C89391z.f203057a;
    }
}
