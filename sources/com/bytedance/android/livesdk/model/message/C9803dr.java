package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.dr */
public final class C9803dr implements AbstractC2724b<C9602af> {
    static {
        Covode.recordClassIndex(11345);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9602af mo7304a(C2730f fVar) {
        C9602af afVar = new C9602af();
        afVar.f23308a = new ArrayList();
        afVar.f23309f = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return afVar;
            } else if (b == 1) {
                afVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                afVar.f23308a.add(Long.valueOf(C2731g.m7902b(fVar)));
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                afVar.f23309f.add(Long.valueOf(C2731g.m7902b(fVar)));
            }
        }
    }
}
