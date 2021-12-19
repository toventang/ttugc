package com.bytedance.android.livesdk.model.message.p580d.p589i;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.i.b */
public final class C9777b implements AbstractC2724b<C9776a> {
    static {
        Covode.recordClassIndex(11319);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9776a mo7304a(C2730f fVar) {
        return m18069b(fVar);
    }

    /* renamed from: b */
    public static C9776a m18069b(C2730f fVar) {
        C9776a aVar = new C9776a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23788a = fVar.mo7314f();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23789b = fVar.mo7313e();
            }
        }
    }
}
