package com.bytedance.android.livesdk.model.message.p580d.p588h;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.h.d */
public final class C9775d implements AbstractC2724b<C9772b> {
    static {
        Covode.recordClassIndex(11317);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9772b mo7304a(C2730f fVar) {
        return m18067b(fVar);
    }

    /* renamed from: b */
    public static C9772b m18067b(C2730f fVar) {
        C9772b bVar = new C9772b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f23785a = fVar.mo7313e();
            } else if (b == 2) {
                bVar.f23787c = fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f23786b = fVar.mo7314f();
            }
        }
    }
}
