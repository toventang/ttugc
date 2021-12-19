package com.bytedance.android.livesdk.chatroom.model.p495b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.l */
public final class C7673l implements AbstractC2724b<C7668g> {
    static {
        Covode.recordClassIndex(8455);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7668g mo7304a(C2730f fVar) {
        C7668g gVar = new C7668g();
        gVar.f19015a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return gVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                gVar.f19015a.add(C7671j.m15665b(fVar));
            }
        }
    }
}
