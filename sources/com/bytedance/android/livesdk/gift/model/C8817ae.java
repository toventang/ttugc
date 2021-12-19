package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.ae */
public final class C8817ae implements AbstractC2724b<C8841f> {
    static {
        Covode.recordClassIndex(9698);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8841f mo7304a(C2730f fVar) {
        return m17122b(fVar);
    }

    /* renamed from: b */
    public static C8841f m17122b(C2730f fVar) {
        C8841f fVar2 = new C8841f();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fVar2;
            } else if (b == 1) {
                fVar2.f21711b = Integer.valueOf(fVar.mo7313e());
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                fVar2.f21712c = C2977f.m8301b(fVar);
            }
        }
    }
}
