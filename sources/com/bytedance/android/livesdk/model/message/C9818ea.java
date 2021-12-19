package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ea */
public final class C9818ea implements AbstractC2724b<C9609al> {
    static {
        Covode.recordClassIndex(11360);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9609al mo7304a(C2730f fVar) {
        C9609al alVar = new C9609al();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return alVar;
            } else if (b == 1) {
                alVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                alVar.f23341a = fVar.mo7313e();
            } else if (b == 3) {
                alVar.f23342f = C9811dz.m18110b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                alVar.f23343g = C9809dx.m18106b(fVar);
            }
        }
    }
}
