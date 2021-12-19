package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.r */
public final class C9654r implements AbstractC2724b<C9637c> {
    static {
        Covode.recordClassIndex(11196);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9637c mo7304a(C2730f fVar) {
        return m17963b(fVar);
    }

    /* renamed from: b */
    public static C9637c m17963b(C2730f fVar) {
        C9637c cVar = new C9637c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b == 1) {
                cVar.f23480a = C9657u.m17969b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f23481b = C9657u.m17969b(fVar);
            }
        }
    }
}
