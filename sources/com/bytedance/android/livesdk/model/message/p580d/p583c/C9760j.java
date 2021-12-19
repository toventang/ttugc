package com.bytedance.android.livesdk.model.message.p580d.p583c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.c.j */
public final class C9760j implements AbstractC2724b<C9755e> {
    static {
        Covode.recordClassIndex(11302);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9755e mo7304a(C2730f fVar) {
        return m18053b(fVar);
    }

    /* renamed from: b */
    public static C9755e m18053b(C2730f fVar) {
        C9755e eVar = new C9755e();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return eVar;
            } else if (b == 2) {
                eVar.f23765a = fVar.mo7313e();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                eVar.f23766b = fVar.mo7313e();
            }
        }
    }
}
