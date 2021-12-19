package com.bytedance.android.livesdk.model.message.p580d.p583c;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.c.f */
public final class C9756f implements AbstractC2724b<C9751a> {
    static {
        Covode.recordClassIndex(11298);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9751a mo7304a(C2730f fVar) {
        return m18046b(fVar);
    }

    /* renamed from: b */
    public static C9751a m18046b(C2730f fVar) {
        C9751a aVar = new C9751a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23732a = fVar.mo7312d();
            } else if (b == 2) {
                aVar.f23733b = fVar.mo7312d();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23734c = C2977f.m8301b(fVar);
            }
        }
    }
}
