package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.c.n */
public final class C9712n implements AbstractC2724b<C9703g> {
    static {
        Covode.recordClassIndex(11254);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9703g mo7304a(C2730f fVar) {
        return m18002b(fVar);
    }

    /* renamed from: b */
    public static C9703g m18002b(C2730f fVar) {
        C9703g gVar = new C9703g();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return gVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                gVar.f23670a = C2977f.m8301b(fVar);
            }
        }
    }
}
