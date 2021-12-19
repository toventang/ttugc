package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ah */
public final class C11710ah implements AbstractC2724b<C11733n> {
    static {
        Covode.recordClassIndex(13398);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11733n mo7304a(C2730f fVar) {
        C11733n nVar = new C11733n();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return nVar;
            } else if (b == 1) {
                nVar.f28069a = C2731g.m7901a(fVar);
            } else if (b == 2) {
                nVar.f28070b = C2731g.m7901a(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                nVar.f28071c = fVar.mo7312d();
            }
        }
    }
}
