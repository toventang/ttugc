package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.model.C9565bv;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.gift.model.aj */
public final class C8822aj implements AbstractC2724b<C8846j> {
    static {
        Covode.recordClassIndex(9703);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8846j mo7304a(C2730f fVar) {
        return m17131b(fVar);
    }

    /* renamed from: b */
    public static C8846j m17131b(C2730f fVar) {
        C8846j jVar = new C8846j();
        jVar.f21730d = new ArrayList();
        jVar.f21729c = new ArrayList();
        jVar.f21727a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return jVar;
            } else if (b == 1) {
                jVar.f21728b = C8826an.m17138b(fVar);
            } else if (b == 2) {
                jVar.f21727a.add(C9565bv.m17884b(fVar));
            } else if (b == 3) {
                jVar.f21729c.add(C8823ak.m17133b(fVar));
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                jVar.f21730d.add(C8813aa.m17115b(fVar));
            }
        }
    }
}
