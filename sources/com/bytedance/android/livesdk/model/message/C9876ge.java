package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ge */
public final class C9876ge implements AbstractC2724b<C9726ci> {
    static {
        Covode.recordClassIndex(11418);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9726ci mo7304a(C2730f fVar) {
        C9726ci ciVar = new C9726ci();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return ciVar;
            } else if (b == 1) {
                ciVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                ciVar.f23719a = C3004j.m8316b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                ciVar.f23720f = C9875gd.m18189b(fVar);
            }
        }
    }
}
