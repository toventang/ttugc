package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.ac */
public final class C9634ac implements AbstractC2724b<C9650n> {
    static {
        Covode.recordClassIndex(11176);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9650n mo7304a(C2730f fVar) {
        return m17955b(fVar);
    }

    /* renamed from: b */
    public static C9650n m17955b(C2730f fVar) {
        C9650n nVar = new C9650n((char) 0);
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return nVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                nVar.f23512a = Long.valueOf(fVar.mo7314f());
            }
        }
    }
}
