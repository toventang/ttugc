package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.by */
public final class C9568by implements AbstractC2724b<C9521ah> {
    static {
        Covode.recordClassIndex(11107);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9521ah mo7304a(C2730f fVar) {
        return m17890b(fVar);
    }

    /* renamed from: b */
    public static C9521ah m17890b(C2730f fVar) {
        C9521ah ahVar = new C9521ah();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return ahVar;
            } else if (b == 1) {
                ahVar.f23099a = Integer.valueOf(fVar.mo7313e());
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                ahVar.f23100b = Integer.valueOf(fVar.mo7313e());
            }
        }
    }
}
