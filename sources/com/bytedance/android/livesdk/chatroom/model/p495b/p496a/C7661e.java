package com.bytedance.android.livesdk.chatroom.model.p495b.p496a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.a.e */
public final class C7661e implements AbstractC2724b<C7658b> {
    static {
        Covode.recordClassIndex(8443);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7658b mo7304a(C2730f fVar) {
        return m15658b(fVar);
    }

    /* renamed from: b */
    public static C7658b m15658b(C2730f fVar) {
        C7658b bVar = new C7658b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f18974a = fVar.mo7313e();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f18975b = fVar.mo7313e();
            }
        }
    }
}
