package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28024q;

/* renamed from: com.bytedance.android.livesdk.model.message.ds */
public final class C9804ds implements AbstractC2724b<C9603ag> {
    static {
        Covode.recordClassIndex(11346);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9603ag mo7304a(C2730f fVar) {
        C9603ag agVar = new C9603ag();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return agVar;
            } else if (b == 1) {
                agVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                agVar.f23310a = C28024q.m56139a(fVar.mo7312d()).mo46789j();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                agVar.f23311f = fVar.mo7313e();
            }
        }
    }
}
