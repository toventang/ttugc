package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.eo */
public final class C9832eo implements AbstractC2724b<C9663ba> {
    static {
        Covode.recordClassIndex(11374);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9663ba mo7304a(C2730f fVar) {
        return m18133b(fVar);
    }

    /* renamed from: b */
    public static C9663ba m18133b(C2730f fVar) {
        C9663ba baVar = new C9663ba();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return baVar;
            } else if (b == 1) {
                baVar.f23516a = fVar.mo7312d();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                baVar.f23517b = C2731g.m7901a(fVar);
            }
        }
    }
}
