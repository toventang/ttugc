package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ez */
public final class C9843ez implements AbstractC2724b<C9675bh> {
    static {
        Covode.recordClassIndex(11385);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9675bh mo7304a(C2730f fVar) {
        C9675bh bhVar = new C9675bh();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bhVar;
            } else if (b == 1) {
                bhVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                bhVar.f23544a = fVar.mo7312d();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bhVar.f23545f = fVar.mo7312d();
            }
        }
    }
}
