package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.ad */
public final class C8816ad implements AbstractC2724b<C8840e> {
    static {
        Covode.recordClassIndex(9697);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8840e mo7304a(C2730f fVar) {
        return m17120b(fVar);
    }

    /* renamed from: b */
    public static C8840e m17120b(C2730f fVar) {
        C8840e eVar = new C8840e();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return eVar;
            } else if (b == 1) {
                eVar.f21709b = fVar.mo7313e();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                eVar.f21708a = Long.valueOf(fVar.mo7314f());
            }
        }
    }
}
