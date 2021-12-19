package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.C9553bj;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.dp */
public final class C9801dp implements AbstractC2724b<C9600ad> {
    static {
        Covode.recordClassIndex(11343);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9600ad mo7304a(C2730f fVar) {
        return m18097b(fVar);
    }

    /* renamed from: b */
    public static C9600ad m18097b(C2730f fVar) {
        C9600ad adVar = new C9600ad();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return adVar;
            } else if (b == 1) {
                adVar.f23303a = fVar.mo7314f();
            } else if (b == 2) {
                adVar.f23304b = fVar.mo7314f();
            } else if (b == 3) {
                adVar.f23305c = C9862fr.m18174b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                adVar.f23306d = C9553bj.m17861b(fVar);
            }
        }
    }
}
