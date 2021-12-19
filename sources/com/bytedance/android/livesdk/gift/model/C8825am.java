package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.am */
public final class C8825am implements AbstractC2724b<C8849m> {
    static {
        Covode.recordClassIndex(9706);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8849m mo7304a(C2730f fVar) {
        C8849m mVar = new C8849m();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return mVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                mVar.f21743a = C8830ar.m17146b(fVar);
            }
        }
    }
}
