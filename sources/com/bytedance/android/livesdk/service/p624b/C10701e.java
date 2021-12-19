package com.bytedance.android.livesdk.service.p624b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.service.b.e */
public final class C10701e implements AbstractC2724b<C10699c> {
    static {
        Covode.recordClassIndex(12298);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C10699c mo7304a(C2730f fVar) {
        C10699c cVar = new C10699c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f25758a = fVar.mo7312d();
            }
        }
    }
}
