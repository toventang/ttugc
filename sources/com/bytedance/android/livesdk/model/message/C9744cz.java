package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.cz */
public final class C9744cz implements AbstractC2724b<C9883n> {
    static {
        Covode.recordClassIndex(11286);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9883n mo7304a(C2730f fVar) {
        C9883n nVar = new C9883n();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return nVar;
            } else if (b == 1) {
                nVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                nVar.f23882a = (int) fVar.mo7314f();
            } else if (b == 3) {
                nVar.f23883f = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                nVar.f23884g = C9743cy.m18039b(fVar);
            }
        }
    }
}
