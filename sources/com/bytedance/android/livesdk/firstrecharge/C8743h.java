package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.livesdk.wallet.C11319h;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.firstrecharge.h */
public final class C8743h implements AbstractC2724b<C8726a> {
    static {
        Covode.recordClassIndex(9617);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8726a mo7304a(C2730f fVar) {
        return m17062b(fVar);
    }

    /* renamed from: b */
    public static C8726a m17062b(C2730f fVar) {
        C8726a aVar = new C8726a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f21534a = C2731g.m7901a(fVar);
            } else if (b == 2) {
                aVar.f21536c = C8744i.m17064b(fVar);
            } else if (b == 3) {
                aVar.f21535b = C11319h.m20059b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f21537d = fVar.mo7313e();
            }
        }
    }
}
