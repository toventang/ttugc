package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.c.j */
public final class C9708j implements AbstractC2724b<C9697a> {
    static {
        Covode.recordClassIndex(11250);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9697a mo7304a(C2730f fVar) {
        return m17994b(fVar);
    }

    /* renamed from: b */
    public static C9697a m17994b(C2730f fVar) {
        C9697a aVar = new C9697a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23643a = fVar.mo7312d();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23644b = fVar.mo7312d();
            }
        }
    }
}
