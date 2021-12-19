package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.gift.model.an */
public final class C8826an implements AbstractC2724b<C8852p> {
    static {
        Covode.recordClassIndex(9707);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8852p mo7304a(C2730f fVar) {
        return m17138b(fVar);
    }

    /* renamed from: b */
    public static C8852p m17138b(C2730f fVar) {
        C8852p pVar = new C8852p();
        pVar.f21748c = new ArrayList();
        pVar.f21757l = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return pVar;
            } else if (b == 1) {
                pVar.f21750e = C2731g.m7902b(fVar);
            } else if (b == 13) {
                pVar.f21757l.add(C8817ae.m17122b(fVar));
            } else if (b == 16) {
                pVar.f21747b = C8828ap.m17142b(fVar);
            } else if (b == 18) {
                pVar.f21755j = C8819ag.m17126b(fVar);
            } else if (b == 3) {
                pVar.f21746a = C2731g.m7902b(fVar);
            } else if (b == 4) {
                pVar.f21751f = fVar.mo7312d();
            } else if (b == 5) {
                pVar.f21748c.add(C8818af.m17124b(fVar));
            } else if (b == 10) {
                pVar.f21754i = C2731g.m7901a(fVar);
            } else if (b != 11) {
                C2731g.m7903c(fVar);
            } else {
                pVar.f21756k = C2977f.m8301b(fVar);
            }
        }
    }
}
