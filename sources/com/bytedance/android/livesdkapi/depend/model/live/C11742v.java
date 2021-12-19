package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.v */
public final class C11742v implements AbstractC2724b<C11718b> {
    static {
        Covode.recordClassIndex(13430);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11718b mo7304a(C2730f fVar) {
        C11718b bVar = new C11718b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f27995a = (int) fVar.mo7314f();
            } else if (b == 2) {
                bVar.f27996b = (int) fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f27997c = (int) fVar.mo7314f();
            }
        }
    }
}
