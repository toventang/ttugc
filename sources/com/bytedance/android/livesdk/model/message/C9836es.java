package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.es */
public final class C9836es implements AbstractC2724b<C9667be> {
    static {
        Covode.recordClassIndex(11378);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9667be mo7304a(C2730f fVar) {
        C9667be beVar = new C9667be();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return beVar;
            } else if (b == 1) {
                beVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                beVar.f23524a = fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                beVar.f23525f = fVar.mo7314f();
            }
        }
    }
}
