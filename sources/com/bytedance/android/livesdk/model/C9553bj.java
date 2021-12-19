package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bj */
public final class C9553bj implements AbstractC2724b<C9591j> {
    static {
        Covode.recordClassIndex(11092);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9591j mo7304a(C2730f fVar) {
        return m17861b(fVar);
    }

    /* renamed from: b */
    public static C9591j m17861b(C2730f fVar) {
        C9591j jVar = new C9591j();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return jVar;
            } else if (b == 1) {
                jVar.f23265a = C2977f.m8301b(fVar);
            } else if (b == 2) {
                jVar.f23266b = fVar.mo7314f();
            } else if (b == 3) {
                jVar.f23267c = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                jVar.f23268d = C2977f.m8301b(fVar);
            }
        }
    }
}
