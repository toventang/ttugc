package com.bytedance.android.livesdk.boostcard;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.boostcard.f */
public final class C6932f implements AbstractC2724b<C6913a> {
    static {
        Covode.recordClassIndex(7671);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C6913a mo7304a(C2730f fVar) {
        return m14794b(fVar);
    }

    /* renamed from: b */
    public static C6913a m14794b(C2730f fVar) {
        C6913a aVar = new C6913a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f17299a = fVar.mo7314f();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f17300b = fVar.mo7314f();
            }
        }
    }
}
