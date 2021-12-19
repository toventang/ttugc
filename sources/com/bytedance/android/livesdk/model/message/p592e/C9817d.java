package com.bytedance.android.livesdk.model.message.p592e;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.e.d */
public final class C9817d implements AbstractC2724b<C9815b> {
    static {
        Covode.recordClassIndex(11359);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9815b mo7304a(C2730f fVar) {
        C9815b bVar = new C9815b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                bVar.f23839a = C9816c.m18114b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f23840f = fVar.mo7313e();
            }
        }
    }
}
