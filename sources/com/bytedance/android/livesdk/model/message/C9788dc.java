package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.dc */
public final class C9788dc implements AbstractC2724b<C9887q> {
    static {
        Covode.recordClassIndex(11330);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9887q mo7304a(C2730f fVar) {
        C9887q qVar = new C9887q();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return qVar;
            } else if (b == 1) {
                qVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                qVar.f23896a = fVar.mo7312d();
            } else if (b == 3) {
                qVar.f23898g = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                qVar.f23897f = fVar.mo7314f();
            }
        }
    }
}
