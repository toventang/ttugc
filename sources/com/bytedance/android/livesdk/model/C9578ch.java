package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.ch */
public final class C9578ch implements AbstractC2724b<C9538av> {
    static {
        Covode.recordClassIndex(11117);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9538av mo7304a(C2730f fVar) {
        return m17908b(fVar);
    }

    /* renamed from: b */
    public static C9538av m17908b(C2730f fVar) {
        C9538av avVar = new C9538av();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return avVar;
            } else if (b == 1) {
                avVar.f23174a = fVar.mo7312d();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                avVar.f23175b = Long.valueOf(fVar.mo7314f());
            }
        }
    }
}
