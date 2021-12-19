package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.as */
public final class C8831as implements AbstractC2724b<C8860x> {
    static {
        Covode.recordClassIndex(9712);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8860x mo7304a(C2730f fVar) {
        C8860x xVar = new C8860x();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return xVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                xVar.f21801a = C8833au.m17151b(fVar);
            }
        }
    }
}
