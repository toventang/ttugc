package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.di */
public final class C9794di implements AbstractC2724b<C9893w> {
    static {
        Covode.recordClassIndex(11336);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9893w mo7304a(C2730f fVar) {
        C9893w wVar = new C9893w();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return wVar;
            } else if (b == 1) {
                wVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                wVar.f23924a = C9716r.m18010b(fVar);
            } else if (b == 3) {
                wVar.f23925f = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                wVar.f23926g = C2731g.m7901a(fVar);
            }
        }
    }
}
