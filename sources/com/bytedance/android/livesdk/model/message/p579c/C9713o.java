package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.c.o */
public final class C9713o implements AbstractC2724b<C9706h> {
    static {
        Covode.recordClassIndex(11255);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9706h mo7304a(C2730f fVar) {
        return m18004b(fVar);
    }

    /* renamed from: b */
    public static C9706h m18004b(C2730f fVar) {
        C9706h hVar = new C9706h();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return hVar;
            } else if (b == 1) {
                hVar.f23675a = fVar.mo7312d();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                hVar.f23676b = fVar.mo7312d();
            }
        }
    }
}
