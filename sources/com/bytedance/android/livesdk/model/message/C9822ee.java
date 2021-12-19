package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ee */
public final class C9822ee implements AbstractC2724b<C9616ap> {
    static {
        Covode.recordClassIndex(11364);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9616ap mo7304a(C2730f fVar) {
        C9616ap apVar = new C9616ap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return apVar;
            } else if (b == 1) {
                apVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                apVar.f23372a = fVar.mo7314f();
            } else if (b == 3) {
                apVar.f23374g = fVar.mo7314f();
            } else if (b == 4) {
                apVar.f23375h = fVar.mo7313e();
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                apVar.f23373f = fVar.mo7314f();
            }
        }
    }
}
