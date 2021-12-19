package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.v */
public final class C9658v implements AbstractC2724b<C9641g> {
    static {
        Covode.recordClassIndex(11200);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9641g mo7304a(C2730f fVar) {
        return m17971b(fVar);
    }

    /* renamed from: b */
    public static C9641g m17971b(C2730f fVar) {
        C9641g gVar = new C9641g();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return gVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                gVar.f23488a = C9657u.m17969b(fVar);
            }
        }
    }
}
