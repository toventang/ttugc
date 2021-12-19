package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.emoji.C2976e;
import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.dd */
public final class C9789dd implements AbstractC2724b<C9889s> {
    static {
        Covode.recordClassIndex(11331);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9889s mo7304a(C2730f fVar) {
        C9889s sVar = new C9889s();
        sVar.f23913a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return sVar;
            } else if (b == 1) {
                sVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                sVar.f23914f = C3004j.m8316b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                sVar.f23913a.add(C2976e.m8299b(fVar));
            }
        }
    }
}
