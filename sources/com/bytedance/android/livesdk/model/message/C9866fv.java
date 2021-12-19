package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.fv */
public final class C9866fv implements AbstractC2724b<C9717ca> {
    static {
        Covode.recordClassIndex(11408);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9717ca mo7304a(C2730f fVar) {
        C9717ca caVar = new C9717ca();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return caVar;
            } else if (b == 1) {
                caVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                caVar.f23681g = C3004j.m8316b(fVar);
            } else if (b == 3) {
                caVar.f23682h = (int) fVar.mo7314f();
            } else if (b == 4) {
                caVar.f23680f = fVar.mo7312d();
            } else if (b == 5) {
                caVar.f23683i = (int) fVar.mo7314f();
            } else if (b == 8) {
                caVar.f23684j = C9737cs.m18031b(fVar);
            } else if (b != 9) {
                C2731g.m7903c(fVar);
            } else {
                caVar.f23685k = C2977f.m8301b(fVar);
            }
        }
    }
}
