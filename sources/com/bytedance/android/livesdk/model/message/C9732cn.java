package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.cn */
public final class C9732cn implements AbstractC2724b<C9745d> {
    static {
        Covode.recordClassIndex(11274);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9745d mo7304a(C2730f fVar) {
        C9745d dVar = new C9745d();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return dVar;
            } else if (b == 1) {
                dVar.f28134O = C11783f.m20759b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                dVar.f23725a = C9731cm.m18022b(fVar);
            }
        }
    }
}
