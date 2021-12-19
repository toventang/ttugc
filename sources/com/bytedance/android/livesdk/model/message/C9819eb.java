package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p578b.C9645j;
import com.bytedance.android.livesdk.model.message.p578b.C9661y;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.model.message.eb */
public final class C9819eb implements AbstractC2724b<C9613am> {
    static {
        Covode.recordClassIndex(11361);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9613am mo7304a(C2730f fVar) {
        C9613am amVar = new C9613am();
        amVar.f23351f = new HashMap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return amVar;
            } else if (b == 1) {
                amVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                amVar.f23350a = C2731g.m7902b(fVar);
            } else if (b == 3) {
                long a2 = fVar.mo7307a();
                Long l = null;
                C9645j jVar = null;
                while (true) {
                    int b2 = fVar.mo7310b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        l = Long.valueOf(C2731g.m7902b(fVar));
                    } else if (b2 == 2) {
                        jVar = C9661y.m17977b(fVar);
                    }
                }
                fVar.mo7309a(a2);
                if (l == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (jVar != null) {
                    amVar.f23351f.put(l, jVar);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            } else if (b == 5) {
                amVar.f23352g = C2731g.m7902b(fVar);
            } else if (b != 6) {
                C2731g.m7903c(fVar);
            } else {
                amVar.f23353h = C2731g.m7902b(fVar);
            }
        }
    }
}
