package com.bytedance.android.livesdk.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.model.cj */
public final class C9580cj implements AbstractC2724b<C9544ba> {
    static {
        Covode.recordClassIndex(11119);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9544ba mo7304a(C2730f fVar) {
        C9544ba baVar = new C9544ba();
        baVar.f23195a = new HashMap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return baVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                long a2 = fVar.mo7307a();
                Long l = null;
                Long l2 = null;
                while (true) {
                    int b2 = fVar.mo7310b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        l = Long.valueOf(C2731g.m7902b(fVar));
                    } else if (b2 == 2) {
                        l2 = Long.valueOf(C2731g.m7902b(fVar));
                    }
                }
                fVar.mo7309a(a2);
                if (l == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (l2 != null) {
                    baVar.f23195a.put(l, l2);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
