package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.t */
public final class C9656t implements AbstractC2724b<C9639e> {
    static {
        Covode.recordClassIndex(11198);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9639e mo7304a(C2730f fVar) {
        return m17967b(fVar);
    }

    /* renamed from: b */
    public static C9639e m17967b(C2730f fVar) {
        C9639e eVar = new C9639e();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return eVar;
            } else if (b == 1) {
                eVar.f23483a = C9657u.m17969b(fVar);
            } else if (b == 2) {
                eVar.f23484b = C9657u.m17969b(fVar);
            } else if (b == 3) {
                eVar.f23485c = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                eVar.f23486d = C2731g.m7901a(fVar);
            }
        }
    }
}
