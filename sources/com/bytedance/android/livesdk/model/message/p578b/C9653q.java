package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.q */
public final class C9653q implements AbstractC2724b<C9636b> {
    static {
        Covode.recordClassIndex(11195);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9636b mo7304a(C2730f fVar) {
        return m17961b(fVar);
    }

    /* renamed from: b */
    public static C9636b m17961b(C2730f fVar) {
        C9636b bVar = new C9636b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f23479a = C9657u.m17969b(fVar);
            }
        }
    }
}
