package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.c.p */
public final class C9714p implements AbstractC2724b<C9707i> {
    static {
        Covode.recordClassIndex(11256);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9707i mo7304a(C2730f fVar) {
        return m18006b(fVar);
    }

    /* renamed from: b */
    public static C9707i m18006b(C2730f fVar) {
        C9707i iVar = new C9707i();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return iVar;
            } else if (b == 1) {
                iVar.f23677a = C3004j.m8316b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                iVar.f23678b = C2731g.m7901a(fVar);
            }
        }
    }
}
