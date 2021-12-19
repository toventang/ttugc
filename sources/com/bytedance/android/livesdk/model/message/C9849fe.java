package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.fe */
public final class C9849fe implements AbstractC2724b<C9681bn> {
    static {
        Covode.recordClassIndex(11391);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9681bn mo7304a(C2730f fVar) {
        C9681bn bnVar = new C9681bn();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bnVar;
            } else if (b == 1) {
                bnVar.f28134O = C11783f.m20759b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                bnVar.f23557a = C2731g.m7901a(fVar);
            }
        }
    }
}
