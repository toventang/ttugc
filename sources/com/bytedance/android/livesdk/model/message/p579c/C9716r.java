package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.c.r */
public final class C9716r implements AbstractC2724b<C9698b> {
    static {
        Covode.recordClassIndex(11258);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9698b mo7304a(C2730f fVar) {
        return m18010b(fVar);
    }

    /* renamed from: b */
    public static C9698b m18010b(C2730f fVar) {
        C9698b bVar = new C9698b();
        bVar.f23648d = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f23645a = fVar.mo7312d();
            } else if (b == 2) {
                bVar.f23646b = fVar.mo7312d();
            } else if (b == 3) {
                bVar.f23647c = C9709k.m17996b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f23648d.add(C9715q.m18008b(fVar));
            }
        }
    }
}
