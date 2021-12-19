package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.s */
public final class C9655s implements AbstractC2724b<C9638d> {
    static {
        Covode.recordClassIndex(11197);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9638d mo7304a(C2730f fVar) {
        return m17965b(fVar);
    }

    /* renamed from: b */
    public static C9638d m17965b(C2730f fVar) {
        C9638d dVar = new C9638d();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return dVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                dVar.f23482a = C9657u.m17969b(fVar);
            }
        }
    }
}
