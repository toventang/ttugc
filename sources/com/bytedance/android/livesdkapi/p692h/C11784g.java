package com.bytedance.android.livesdkapi.p692h;

import com.bytedance.android.livesdkapi.p692h.C11781e;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.h.g */
public final class C11784g implements AbstractC2724b<C11781e.C11782a> {
    static {
        Covode.recordClassIndex(13474);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11781e.C11782a mo7304a(C2730f fVar) {
        return m20761b(fVar);
    }

    /* renamed from: b */
    public static C11781e.C11782a m20761b(C2730f fVar) {
        C11781e.C11782a aVar = new C11781e.C11782a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f28163a = fVar.mo7312d();
            } else if (b == 2) {
                aVar.f28164b = fVar.mo7311c();
            } else if (b == 3) {
                aVar.f28165c = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f28166d = fVar.mo7313e();
            }
        }
    }
}
