package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.ek */
public final class C9828ek implements AbstractC2724b<C9625ax> {
    static {
        Covode.recordClassIndex(11370);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9625ax mo7304a(C2730f fVar) {
        C9625ax axVar = new C9625ax();
        axVar.f23441f = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return axVar;
            } else if (b == 1) {
                axVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                axVar.f23440a = fVar.mo7312d();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                axVar.f23441f.add(C9827ej.m18126b(fVar));
            }
        }
    }
}
