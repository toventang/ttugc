package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.dw */
public final class C9808dw implements AbstractC2724b<C9608ak> {
    static {
        Covode.recordClassIndex(11350);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9608ak mo7304a(C2730f fVar) {
        C9608ak akVar = new C9608ak();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return akVar;
            } else if (b == 1) {
                akVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                akVar.f23338a = fVar.mo7312d();
            } else if (b == 3) {
                akVar.f23339f = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                akVar.f23340g = fVar.mo7313e();
            }
        }
    }
}
