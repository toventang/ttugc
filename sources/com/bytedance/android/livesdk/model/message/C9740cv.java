package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.cv */
public final class C9740cv implements AbstractC2724b<C9880k> {
    static {
        Covode.recordClassIndex(11282);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9880k mo7304a(C2730f fVar) {
        C9880k kVar = new C9880k();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return kVar;
            } else if (b == 1) {
                kVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                kVar.f23865a = fVar.mo7312d();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                kVar.f23866f = C2731g.m7901a(fVar);
            }
        }
    }
}
