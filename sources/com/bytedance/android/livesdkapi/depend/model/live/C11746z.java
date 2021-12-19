package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.z */
public final class C11746z implements AbstractC2724b<C11720d> {
    static {
        Covode.recordClassIndex(13434);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11720d mo7304a(C2730f fVar) {
        return m20706b(fVar);
    }

    /* renamed from: b */
    public static C11720d m20706b(C2730f fVar) {
        C11720d dVar = new C11720d();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return dVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                dVar.f27999a = fVar.mo7313e();
            }
        }
    }
}
