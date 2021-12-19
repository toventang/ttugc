package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bf */
public final class C9549bf implements AbstractC2724b<C9587g> {
    static {
        Covode.recordClassIndex(11088);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9587g mo7304a(C2730f fVar) {
        return m17853b(fVar);
    }

    /* renamed from: b */
    public static C9587g m17853b(C2730f fVar) {
        C9587g gVar = new C9587g();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return gVar;
            } else if (b == 1) {
                gVar.f23238a = fVar.mo7312d();
            } else if (b == 2) {
                gVar.f23239b = fVar.mo7312d();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                gVar.f23240c = C2977f.m8301b(fVar);
            }
        }
    }
}
