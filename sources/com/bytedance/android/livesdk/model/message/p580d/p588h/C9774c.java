package com.bytedance.android.livesdk.model.message.p580d.p588h;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.h.c */
public final class C9774c implements AbstractC2724b<C9771a> {
    static {
        Covode.recordClassIndex(11316);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9771a mo7304a(C2730f fVar) {
        return m18065b(fVar);
    }

    /* renamed from: b */
    public static C9771a m18065b(C2730f fVar) {
        C9771a aVar = new C9771a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23783a = C9775d.m18067b(fVar);
            }
        }
    }
}
