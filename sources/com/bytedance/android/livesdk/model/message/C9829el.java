package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.el */
public final class C9829el implements AbstractC2724b<C9627ay.C9628a> {
    static {
        Covode.recordClassIndex(11371);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9627ay.C9628a mo7304a(C2730f fVar) {
        return m18129b(fVar);
    }

    /* renamed from: b */
    public static C9627ay.C9628a m18129b(C2730f fVar) {
        C9627ay.C9628a aVar = new C9627ay.C9628a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23464a = (int) fVar.mo7314f();
            } else if (b == 2) {
                aVar.f23465b = C2977f.m8301b(fVar);
            } else if (b == 4) {
                aVar.f23466c = C9716r.m18010b(fVar);
            } else if (b != 8) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23467d = C2977f.m8301b(fVar);
            }
        }
    }
}
