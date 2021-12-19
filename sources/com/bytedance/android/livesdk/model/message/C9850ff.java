package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ff */
public final class C9850ff implements AbstractC2724b<C9676bi> {
    static {
        Covode.recordClassIndex(11392);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9676bi mo7304a(C2730f fVar) {
        return m18156b(fVar);
    }

    /* renamed from: b */
    public static C9676bi m18156b(C2730f fVar) {
        C9676bi biVar = new C9676bi();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return biVar;
            } else if (b == 1) {
                biVar.f23546a = fVar.mo7314f();
            } else if (b == 2) {
                biVar.f23547b = fVar.mo7312d();
            } else if (b == 3) {
                biVar.f23548c = fVar.mo7313e();
            } else if (b == 4) {
                biVar.f23549d = fVar.mo7314f();
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                biVar.f23550e = C3004j.m8316b(fVar);
            }
        }
    }
}
