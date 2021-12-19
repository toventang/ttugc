package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ae */
public final class C11707ae implements AbstractC2724b<C11726g> {
    static {
        Covode.recordClassIndex(13395);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11726g mo7304a(C2730f fVar) {
        return m20664b(fVar);
    }

    /* renamed from: b */
    public static C11726g m20664b(C2730f fVar) {
        C11726g gVar = new C11726g();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return gVar;
            } else if (b == 1) {
                gVar.f28053a = fVar.mo7312d();
            } else if (b == 2) {
                gVar.f28054b = fVar.mo7313e();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                gVar.f28055c = C11746z.m20706b(fVar);
            }
        }
    }
}
