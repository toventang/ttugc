package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.cy */
public final class C9743cy implements AbstractC2724b<C9883n.C9884a> {
    static {
        Covode.recordClassIndex(11285);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9883n.C9884a mo7304a(C2730f fVar) {
        return m18039b(fVar);
    }

    /* renamed from: b */
    public static C9883n.C9884a m18039b(C2730f fVar) {
        C9883n.C9884a aVar = new C9883n.C9884a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23885a = fVar.mo7312d();
            } else if (b == 2) {
                aVar.f23886b = fVar.mo7314f();
            } else if (b == 3) {
                aVar.f23887c = C9716r.m18010b(fVar);
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23888d = C9716r.m18010b(fVar);
            }
        }
    }
}
