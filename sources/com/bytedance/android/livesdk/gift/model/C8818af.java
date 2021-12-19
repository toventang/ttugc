package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.af */
public final class C8818af implements AbstractC2724b<C8842g> {
    static {
        Covode.recordClassIndex(9699);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8842g mo7304a(C2730f fVar) {
        return m17124b(fVar);
    }

    /* renamed from: b */
    public static C8842g m17124b(C2730f fVar) {
        C8842g gVar = new C8842g();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return gVar;
            } else if (b == 1) {
                gVar.f21713a = fVar.mo7313e();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                gVar.f21714b = fVar.mo7312d();
            }
        }
    }
}
