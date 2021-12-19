package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.u */
public final class C9657u implements AbstractC2724b<C9640f> {
    static {
        Covode.recordClassIndex(11199);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9640f mo7304a(C2730f fVar) {
        return m17969b(fVar);
    }

    /* renamed from: b */
    public static C9640f m17969b(C2730f fVar) {
        C9640f fVar2 = new C9640f();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fVar2;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                fVar2.f23487a = fVar.mo7312d();
            }
        }
    }
}
