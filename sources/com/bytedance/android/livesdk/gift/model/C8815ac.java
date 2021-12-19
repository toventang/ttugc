package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.ac */
public final class C8815ac implements AbstractC2724b<C8839d> {
    static {
        Covode.recordClassIndex(9696);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8839d mo7304a(C2730f fVar) {
        return m17118b(fVar);
    }

    /* renamed from: b */
    public static C8839d m17118b(C2730f fVar) {
        C8839d dVar = new C8839d();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return dVar;
            } else if (b == 1) {
                dVar.f21705d = Integer.valueOf(fVar.mo7313e());
            } else if (b == 2) {
                dVar.f21706e = Integer.valueOf(fVar.mo7313e());
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                dVar.f21707f = Long.valueOf(fVar.mo7314f());
            }
        }
    }
}
