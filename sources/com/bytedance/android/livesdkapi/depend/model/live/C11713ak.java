package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.ak */
public final class C11713ak implements AbstractC2724b<C11737r> {
    static {
        Covode.recordClassIndex(13401);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11737r mo7304a(C2730f fVar) {
        C11737r rVar = new C11737r();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return rVar;
            } else if (b == 1) {
                rVar.f28088a = fVar.mo7314f();
            } else if (b == 2) {
                rVar.f28089b = fVar.mo7312d();
            } else if (b == 3) {
                rVar.f28090c = fVar.mo7314f();
            } else if (b == 4) {
                rVar.f28091d = fVar.mo7314f();
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                rVar.f28092e = fVar.mo7314f();
            }
        }
    }
}
