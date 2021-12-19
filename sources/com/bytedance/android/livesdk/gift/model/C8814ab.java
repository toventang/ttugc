package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.ab */
public final class C8814ab implements AbstractC2724b<C8838c> {
    static {
        Covode.recordClassIndex(9695);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8838c mo7304a(C2730f fVar) {
        C8838c cVar = new C8838c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b == 1) {
                cVar.f21699c = C8815ac.m17118b(fVar);
            } else if (b == 2) {
                cVar.f21700d = Long.valueOf(fVar.mo7314f());
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f21701e = Boolean.valueOf(C2731g.m7901a(fVar));
            }
        }
    }
}
