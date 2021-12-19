package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.fu */
public final class C9865fu implements AbstractC2724b<C9694bz> {
    static {
        Covode.recordClassIndex(11407);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9694bz mo7304a(C2730f fVar) {
        C9694bz bzVar = new C9694bz();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bzVar;
            } else if (b == 1) {
                bzVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                bzVar.f23626a = fVar.mo7313e();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bzVar.f23627f = fVar.mo7312d();
            }
        }
    }
}
