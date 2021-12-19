package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.ad */
public final class C9635ad implements AbstractC2724b<C9651o> {
    static {
        Covode.recordClassIndex(11177);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9651o mo7304a(C2730f fVar) {
        return m17957b(fVar);
    }

    /* renamed from: b */
    public static C9651o m17957b(C2730f fVar) {
        C9651o oVar = new C9651o((char) 0);
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return oVar;
            } else if (b == 1) {
                oVar.f23514a = Long.valueOf(fVar.mo7314f());
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                oVar.f23515b = C9661y.m17977b(fVar);
            }
        }
    }
}
