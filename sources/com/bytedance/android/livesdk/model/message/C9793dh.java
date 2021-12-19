package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.dh */
public final class C9793dh implements AbstractC2724b<C9892v> {
    static {
        Covode.recordClassIndex(11335);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9892v mo7304a(C2730f fVar) {
        C9892v vVar = new C9892v();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return vVar;
            } else if (b == 1) {
                vVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                vVar.f23921a = fVar.mo7314f();
            } else if (b == 3) {
                vVar.f23922f = C2977f.m8301b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                vVar.f23923g = C9862fr.m18174b(fVar);
            }
        }
    }
}
