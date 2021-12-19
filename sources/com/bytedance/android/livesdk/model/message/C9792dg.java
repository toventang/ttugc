package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.dg */
public final class C9792dg implements AbstractC2724b<C9891u> {
    static {
        Covode.recordClassIndex(11334);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9891u mo7304a(C2730f fVar) {
        C9891u uVar = new C9891u();
        uVar.f23920a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return uVar;
            } else if (b == 1) {
                uVar.f28134O = C11783f.m20759b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                uVar.f23920a.add(C9735cq.m18028b(fVar));
            }
        }
    }
}
