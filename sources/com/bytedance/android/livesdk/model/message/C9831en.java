package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.en */
public final class C9831en implements AbstractC2724b<C9629az> {
    static {
        Covode.recordClassIndex(11373);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9629az mo7304a(C2730f fVar) {
        C9629az azVar = new C9629az();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return azVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                azVar.f23468a = fVar.mo7313e();
            }
        }
    }
}
