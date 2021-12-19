package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.cs */
public final class C9737cs implements AbstractC2724b<C9877h> {
    static {
        Covode.recordClassIndex(11279);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9877h mo7304a(C2730f fVar) {
        return m18031b(fVar);
    }

    /* renamed from: b */
    public static C9877h m18031b(C2730f fVar) {
        C9877h hVar = new C9877h();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return hVar;
            } else if (b == 1) {
                hVar.f23850a = C2977f.m8301b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                hVar.f23851b = C2977f.m8301b(fVar);
            }
        }
    }
}
