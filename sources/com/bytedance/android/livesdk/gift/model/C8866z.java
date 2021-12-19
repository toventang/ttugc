package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.z */
public final class C8866z implements AbstractC2724b<C8810a> {
    static {
        Covode.recordClassIndex(9747);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8810a mo7304a(C2730f fVar) {
        return m17165b(fVar);
    }

    /* renamed from: b */
    public static C8810a m17165b(C2730f fVar) {
        C8810a aVar = new C8810a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f21690a = (int) fVar.mo7314f();
            } else if (b == 2) {
                aVar.f21691b = (int) fVar.mo7314f();
            } else if (b == 3) {
                aVar.f21692c = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f21693d = (int) fVar.mo7314f();
            }
        }
    }
}
