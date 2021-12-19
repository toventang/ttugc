package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.ci */
public final class C9579ci implements AbstractC2724b<C9540ax> {
    static {
        Covode.recordClassIndex(11118);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9540ax mo7304a(C2730f fVar) {
        return m17910b(fVar);
    }

    /* renamed from: b */
    public static C9540ax m17910b(C2730f fVar) {
        C9540ax axVar = new C9540ax();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return axVar;
            } else if (b == 1) {
                axVar.f23187a = fVar.mo7314f();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                axVar.f23188b = C3004j.m8316b(fVar);
            }
        }
    }
}
