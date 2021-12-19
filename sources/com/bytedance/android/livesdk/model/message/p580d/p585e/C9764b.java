package com.bytedance.android.livesdk.model.message.p580d.p585e;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.e.b */
public final class C9764b implements AbstractC2724b<C9763a> {
    static {
        Covode.recordClassIndex(11306);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9763a mo7304a(C2730f fVar) {
        return m18057b(fVar);
    }

    /* renamed from: b */
    public static C9763a m18057b(C2730f fVar) {
        C9763a aVar = new C9763a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23768a = fVar.mo7314f();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23769b = fVar.mo7312d();
            }
        }
    }
}
