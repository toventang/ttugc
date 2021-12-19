package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.eq */
public final class C9834eq implements AbstractC2724b<C9665bc> {
    static {
        Covode.recordClassIndex(11376);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9665bc mo7304a(C2730f fVar) {
        C9665bc bcVar = new C9665bc();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bcVar;
            } else if (b == 1) {
                bcVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                bcVar.f23520a = fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bcVar.f23521f = fVar.mo7314f();
            }
        }
    }
}
