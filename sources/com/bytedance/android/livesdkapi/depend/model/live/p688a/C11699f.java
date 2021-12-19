package com.bytedance.android.livesdkapi.depend.model.live.p688a;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.a.f */
public final class C11699f implements AbstractC2724b<C11694a> {
    static {
        Covode.recordClassIndex(13387);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11694a mo7304a(C2730f fVar) {
        return m20648b(fVar);
    }

    /* renamed from: b */
    public static C11694a m20648b(C2730f fVar) {
        C11694a aVar = new C11694a((byte) 0);
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f27972a = Long.valueOf(fVar.mo7314f());
            } else if (b == 2) {
                aVar.f27973b = fVar.mo7312d();
            } else if (b == 3) {
                aVar.f27975d = C2977f.m8301b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f27974c = fVar.mo7312d();
            }
        }
    }
}
