package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11701h;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ai */
public final class C11711ai implements AbstractC2724b<C11735p> {
    static {
        Covode.recordClassIndex(13399);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11735p mo7304a(C2730f fVar) {
        return m20670b(fVar);
    }

    /* renamed from: b */
    public static C11735p m20670b(C2730f fVar) {
        C11735p pVar = new C11735p();
        pVar.f28081c = new ArrayList();
        pVar.f28082d = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return pVar;
            } else if (b == 1) {
                pVar.f28079a = C2731g.m7902b(fVar);
            } else if (b == 5) {
                pVar.f28080b = C2731g.m7902b(fVar);
            } else if (b != 6) {
                switch (b) {
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        pVar.f28081c.add(C3004j.m8316b(fVar));
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        pVar.f28083e = C11701h.m20652b(fVar);
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        pVar.f28084f = C2731g.m7902b(fVar);
                        continue;
                    default:
                        C2731g.m7903c(fVar);
                        continue;
                }
            } else {
                pVar.f28082d.add(Long.valueOf(C2731g.m7902b(fVar)));
            }
        }
    }
}
