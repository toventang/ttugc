package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.C9575ce;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.fy */
public final class C9869fy implements AbstractC2724b<C9720cd> {
    static {
        Covode.recordClassIndex(11411);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9720cd mo7304a(C2730f fVar) {
        C9720cd cdVar = new C9720cd();
        cdVar.f23693a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cdVar;
            } else if (b == 1) {
                cdVar.f28134O = C11783f.m20759b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                cdVar.f23693a.add(C9575ce.m17902b(fVar));
            }
        }
    }
}
