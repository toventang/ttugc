package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.eh */
public final class C9825eh implements AbstractC2724b<C9620at> {
    static {
        Covode.recordClassIndex(11367);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9620at mo7304a(C2730f fVar) {
        C9620at atVar = new C9620at();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return atVar;
            } else if (b == 1) {
                atVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                atVar.f23419a = fVar.mo7314f();
            } else if (b == 3) {
                atVar.f23420f = fVar.mo7313e();
            } else if (b == 4) {
                atVar.f23421g = fVar.mo7312d();
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                atVar.f23422h = C3004j.m8316b(fVar);
            }
        }
    }
}
