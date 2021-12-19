package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.C9553bj;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.gc */
public final class C9874gc implements AbstractC2724b<C9725ch> {
    static {
        Covode.recordClassIndex(11416);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9725ch mo7304a(C2730f fVar) {
        C9725ch chVar = new C9725ch();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return chVar;
            } else if (b == 1) {
                chVar.f23717a = fVar.mo7314f();
            } else if (b == 2) {
                chVar.f23718f = C9553bj.m17861b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                chVar.f28134O = C11783f.m20759b(fVar);
            }
        }
    }
}
