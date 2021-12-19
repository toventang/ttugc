package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdk.model.message.C9670bg;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ex */
public final class C9841ex implements AbstractC2724b<C9670bg.C9674d> {
    static {
        Covode.recordClassIndex(11383);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9670bg.C9674d mo7304a(C2730f fVar) {
        return m18147b(fVar);
    }

    /* renamed from: b */
    public static C9670bg.C9674d m18147b(C2730f fVar) {
        C9670bg.C9674d dVar = new C9670bg.C9674d();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return dVar;
            } else if (b == 1) {
                dVar.f23540a = fVar.mo7314f();
            } else if (b == 2) {
                dVar.f23541b = fVar.mo7314f();
            } else if (b == 3) {
                dVar.f23542c = C3004j.m8316b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                dVar.f23543d = C3004j.m8316b(fVar);
            }
        }
    }
}
