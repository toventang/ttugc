package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.df */
public final class C9791df implements AbstractC2724b<C9890t> {
    static {
        Covode.recordClassIndex(11333);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9890t mo7304a(C2730f fVar) {
        C9890t tVar = new C9890t();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return tVar;
            } else if (b == 1) {
                tVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 3) {
                tVar.f23916f = fVar.mo7312d();
            } else if (b != 6) {
                C2731g.m7903c(fVar);
            } else {
                tVar.f23915a = fVar.mo7314f();
            }
        }
    }
}
