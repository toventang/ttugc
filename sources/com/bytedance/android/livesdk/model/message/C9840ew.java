package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdk.model.message.C9670bg;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ew */
public final class C9840ew implements AbstractC2724b<C9670bg.C9673c> {
    static {
        Covode.recordClassIndex(11382);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9670bg.C9673c mo7304a(C2730f fVar) {
        return m18145b(fVar);
    }

    /* renamed from: b */
    public static C9670bg.C9673c m18145b(C2730f fVar) {
        C9670bg.C9673c cVar = new C9670bg.C9673c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f23539a = C3004j.m8316b(fVar);
            }
        }
    }
}
