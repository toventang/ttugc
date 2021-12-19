package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.gift.model.au */
public final class C8833au implements AbstractC2724b<C8860x.C8864c> {
    static {
        Covode.recordClassIndex(9714);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8860x.C8864c mo7304a(C2730f fVar) {
        return m17151b(fVar);
    }

    /* renamed from: b */
    public static C8860x.C8864c m17151b(C2730f fVar) {
        C8860x.C8864c cVar = new C8860x.C8864c();
        cVar.f21813b = new ArrayList();
        cVar.f21814c = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b == 1) {
                cVar.f21812a = fVar.mo7313e();
            } else if (b == 2) {
                cVar.f21813b.add(C8835aw.m17155b(fVar));
            } else if (b == 3) {
                cVar.f21814c.add(C8832at.m17149b(fVar));
            } else if (b == 4) {
                cVar.f21815d = fVar.mo7313e();
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f21816e = fVar.mo7312d();
            }
        }
    }
}
