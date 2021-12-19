package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.C11738s;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.an */
public final class C11716an implements AbstractC2724b<C11738s.C11739a> {
    static {
        Covode.recordClassIndex(13404);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11738s.C11739a mo7304a(C2730f fVar) {
        return m20678b(fVar);
    }

    /* renamed from: b */
    public static C11738s.C11739a m20678b(C2730f fVar) {
        C11738s.C11739a aVar = new C11738s.C11739a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f28114a = C2731g.m7901a(fVar);
            } else if (b == 2) {
                aVar.f28116c = (int) fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f28115b = C2731g.m7901a(fVar);
            }
        }
    }
}
