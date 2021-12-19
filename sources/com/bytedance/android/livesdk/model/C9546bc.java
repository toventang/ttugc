package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bc */
public final class C9546bc implements AbstractC2724b<C9570c> {
    static {
        Covode.recordClassIndex(11085);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9570c mo7304a(C2730f fVar) {
        return m17847b(fVar);
    }

    /* renamed from: b */
    public static C9570c m17847b(C2730f fVar) {
        C9570c cVar = new C9570c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b == 1) {
                cVar.f23220a = C2977f.m8301b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f23221b = C2977f.m8301b(fVar);
            }
        }
    }
}
