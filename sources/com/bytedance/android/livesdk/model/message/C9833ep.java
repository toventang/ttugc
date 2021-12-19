package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.ep */
public final class C9833ep implements AbstractC2724b<C9664bb> {
    static {
        Covode.recordClassIndex(11375);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9664bb mo7304a(C2730f fVar) {
        return m18135b(fVar);
    }

    /* renamed from: b */
    public static C9664bb m18135b(C2730f fVar) {
        C9664bb bbVar = new C9664bb();
        bbVar.f23519b = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bbVar;
            } else if (b == 1) {
                bbVar.f23519b.add(C9832eo.m18133b(fVar));
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                bbVar.f23518a = fVar.mo7312d();
            }
        }
    }
}
