package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.fc */
public final class C9847fc implements AbstractC2724b<C9679bl> {
    static {
        Covode.recordClassIndex(11389);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9679bl mo7304a(C2730f fVar) {
        C9679bl blVar = new C9679bl();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return blVar;
            } else if (b == 1) {
                blVar.f28134O = C11783f.m20759b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                blVar.f23555a = C9850ff.m18156b(fVar);
            }
        }
    }
}
