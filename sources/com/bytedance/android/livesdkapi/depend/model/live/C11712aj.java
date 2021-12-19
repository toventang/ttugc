package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.aj */
public final class C11712aj implements AbstractC2724b<C11736q> {
    static {
        Covode.recordClassIndex(13400);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11736q mo7304a(C2730f fVar) {
        C11736q qVar = new C11736q();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return qVar;
            } else if (b == 1) {
                qVar.f28085a = fVar.mo7313e();
            } else if (b == 2) {
                qVar.f28086b = fVar.mo7312d();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                qVar.f28087c = fVar.mo7312d();
            }
        }
    }
}
