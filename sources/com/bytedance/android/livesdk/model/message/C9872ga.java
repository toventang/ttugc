package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ga */
public final class C9872ga implements AbstractC2724b<C9722cf> {
    static {
        Covode.recordClassIndex(11414);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9722cf mo7304a(C2730f fVar) {
        return m18185b(fVar);
    }

    /* renamed from: b */
    public static C9722cf m18185b(C2730f fVar) {
        C9722cf cfVar = new C9722cf();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cfVar;
            } else if (b == 1) {
                cfVar.f23697a = C9870fz.m18183b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                cfVar.f23698b = C9870fz.m18183b(fVar);
            }
        }
    }
}
