package com.bytedance.android.livesdk.p603q;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.q.b */
final /* synthetic */ class C10137b implements AbstractC89172b {

    /* renamed from: a */
    private final C10136a f24594a;

    static {
        Covode.recordClassIndex(11700);
    }

    C10137b(C10136a aVar) {
        this.f24594a = aVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C10136a aVar = this.f24594a;
        aVar.f24586b.setVisibility(0);
        if (aVar.f24587c && aVar.f24588d != null) {
            aVar.f24588d.setVisibility(8);
        }
        aVar.f24586b.mo17591a(new RunnableC10141f(aVar));
        return C89391z.f203057a;
    }
}
