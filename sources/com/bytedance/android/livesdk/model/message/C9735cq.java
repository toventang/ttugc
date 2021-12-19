package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.cq */
public final class C9735cq implements AbstractC2724b<C9844f> {
    static {
        Covode.recordClassIndex(11277);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9844f mo7304a(C2730f fVar) {
        return m18028b(fVar);
    }

    /* renamed from: b */
    public static C9844f m18028b(C2730f fVar) {
        C9844f fVar2 = new C9844f();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fVar2;
            } else if (b == 1) {
                fVar2.f23842a = fVar.mo7314f();
            } else if (b == 2) {
                fVar2.f23843b = fVar.mo7313e();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                fVar2.f23844c = fVar.mo7314f();
            }
        }
    }
}
