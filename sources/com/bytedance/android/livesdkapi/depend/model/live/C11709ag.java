package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ag */
public final class C11709ag implements AbstractC2724b<C11731l> {
    static {
        Covode.recordClassIndex(13397);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11731l mo7304a(C2730f fVar) {
        C11731l lVar = new C11731l();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return lVar;
            } else if (b == 2) {
                lVar.f28065a = fVar.mo7312d();
            } else if (b == 3) {
                lVar.f28066b = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                lVar.f28067c = fVar.mo7312d();
            }
        }
    }
}
