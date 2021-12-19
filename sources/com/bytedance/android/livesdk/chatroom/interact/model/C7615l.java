package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.l */
public final class C7615l implements AbstractC2724b<C7604c> {
    static {
        Covode.recordClassIndex(8390);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7604c mo7304a(C2730f fVar) {
        C7604c cVar = new C7604c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f18856a = C7613j.m15625b(fVar);
            }
        }
    }
}
