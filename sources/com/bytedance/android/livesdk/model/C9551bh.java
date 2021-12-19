package com.bytedance.android.livesdk.model;

import com.bytedance.android.livesdk.model.C9589i;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bh */
public final class C9551bh implements AbstractC2724b<C9589i.C9590a> {
    static {
        Covode.recordClassIndex(11090);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9589i.C9590a mo7304a(C2730f fVar) {
        return m17857b(fVar);
    }

    /* renamed from: b */
    public static C9589i.C9590a m17857b(C2730f fVar) {
        C9589i.C9590a aVar = new C9589i.C9590a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23264a = fVar.mo7312d();
            }
        }
    }
}
