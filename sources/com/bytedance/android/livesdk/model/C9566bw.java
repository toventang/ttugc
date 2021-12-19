package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bw */
public final class C9566bw implements AbstractC2724b<C9916x> {
    static {
        Covode.recordClassIndex(11105);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9916x mo7304a(C2730f fVar) {
        return m17886b(fVar);
    }

    /* renamed from: b */
    public static C9916x m17886b(C2730f fVar) {
        C9916x xVar = new C9916x();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return xVar;
            } else if (b == 1) {
                xVar.f24040c = C2977f.m8301b(fVar);
            } else if (b == 2) {
                xVar.f24039b = (int) fVar.mo7314f();
            } else if (b == 3) {
                xVar.f24041d = (int) fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                xVar.f24038a = fVar.mo7312d();
            }
        }
    }
}
