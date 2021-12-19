package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.a.g */
public final class C45786g implements AbstractC2724b<C45781b> {
    static {
        Covode.recordClassIndex(54304);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C45781b mo7304a(C2730f fVar) {
        C45781b bVar = new C45781b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                bVar.f106657i = fVar.mo7313e();
            } else if (b == 3) {
                bVar.f106658j = fVar.mo7313e();
            } else if (b == 4) {
                bVar.f106659k = C45787h.m88383b(fVar);
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f106660l = C45788i.m88385b(fVar);
            }
        }
    }
}
