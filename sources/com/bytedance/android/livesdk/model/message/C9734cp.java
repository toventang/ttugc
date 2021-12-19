package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.cp */
public final class C9734cp implements AbstractC2724b<C9812e> {
    static {
        Covode.recordClassIndex(11276);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9812e mo7304a(C2730f fVar) {
        C9812e eVar = new C9812e();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return eVar;
            } else if (b == 1) {
                eVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                eVar.f23823a = C9733co.m18025b(fVar);
            } else if (b == 3) {
                eVar.f23824f = fVar.mo7313e();
            } else if (b == 4) {
                eVar.f23825g = C2977f.m8301b(fVar);
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                eVar.f23826h = C9716r.m18010b(fVar);
            }
        }
    }
}
