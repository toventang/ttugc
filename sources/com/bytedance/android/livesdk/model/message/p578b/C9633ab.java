package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.ab */
public final class C9633ab implements AbstractC2724b<C9649m> {
    static {
        Covode.recordClassIndex(11175);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9649m mo7304a(C2730f fVar) {
        return m17953b(fVar);
    }

    /* renamed from: b */
    public static C9649m m17953b(C2730f fVar) {
        C9649m mVar = new C9649m();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return mVar;
            } else if (b == 1) {
                mVar.f23510a = C2731g.m7901a(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                mVar.f23511b = fVar.mo7313e();
            }
        }
    }
}
