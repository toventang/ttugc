package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.firstrecharge.j */
public final class C8745j implements AbstractC2724b<C8728c> {
    static {
        Covode.recordClassIndex(9619);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8728c mo7304a(C2730f fVar) {
        C8728c cVar = new C8728c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f21541a = C8743h.m17062b(fVar);
            }
        }
    }
}
