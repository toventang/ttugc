package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.C9575ce;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.da */
public final class C9786da implements AbstractC2724b<C9885o> {
    static {
        Covode.recordClassIndex(11328);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9885o mo7304a(C2730f fVar) {
        C9885o oVar = new C9885o();
        oVar.f23890a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return oVar;
            } else if (b == 1) {
                oVar.f28134O = C11783f.m20759b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                oVar.f23890a.add(C9575ce.m17902b(fVar));
            }
        }
    }
}
