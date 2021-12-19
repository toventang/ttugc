package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.z */
public final class C9662z implements AbstractC2724b<C9646k> {
    static {
        Covode.recordClassIndex(11204);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9646k mo7304a(C2730f fVar) {
        return m17979b(fVar);
    }

    /* renamed from: b */
    public static C9646k m17979b(C2730f fVar) {
        C9646k kVar = new C9646k();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return kVar;
            } else if (b == 1) {
                kVar.f23504a = fVar.mo7314f();
            } else if (b == 2) {
                kVar.f23505b = (int) fVar.mo7314f();
            } else if (b == 3) {
                kVar.f23506c = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                kVar.f23507d = C2977f.m8301b(fVar);
            }
        }
    }
}
