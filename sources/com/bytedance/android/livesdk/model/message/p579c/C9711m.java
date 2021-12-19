package com.bytedance.android.livesdk.model.message.p579c;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.c.m */
public final class C9711m implements AbstractC2724b<C9702f> {
    static {
        Covode.recordClassIndex(11253);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9702f mo7304a(C2730f fVar) {
        return m18000b(fVar);
    }

    /* renamed from: b */
    public static C9702f m18000b(C2730f fVar) {
        C9702f fVar2 = new C9702f();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fVar2;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                fVar2.f23669a = fVar.mo7312d();
            }
        }
    }
}
