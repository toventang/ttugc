package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.s */
final /* synthetic */ class C67934s implements AbstractC89172b {

    /* renamed from: a */
    private final C67925j f152181a;

    static {
        Covode.recordClassIndex(80103);
    }

    C67934s(C67925j jVar) {
        this.f152181a = jVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C67925j jVar = this.f152181a;
        Boolean bool = (Boolean) obj;
        if (jVar.f152164l != null && jVar.f152164l.isShowing()) {
            jVar.f152164l.dismiss();
        }
        jVar.f152154b.mo110050b(false);
        if (!bool.booleanValue()) {
            C74172g gVar = jVar.f152160h;
            C14207x xVar = new C14207x("on photo token");
            xVar.f34485a = 3;
            gVar.mo22879a(xVar);
        }
        return C89391z.f203057a;
    }
}
