package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.u */
public final class C11741u implements AbstractC2724b<C11693a> {
    static {
        Covode.recordClassIndex(13429);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11693a mo7304a(C2730f fVar) {
        C11693a aVar = new C11693a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f27968a = fVar.mo7314f();
            } else if (b == 2) {
                aVar.f27969b = fVar.mo7314f();
            } else if (b == 3) {
                aVar.f27970c = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f27971d = C2977f.m8301b(fVar);
            }
        }
    }
}
