package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.ai */
public final class C8821ai implements AbstractC2724b<C8844i> {
    static {
        Covode.recordClassIndex(9702);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8844i mo7304a(C2730f fVar) {
        C8844i iVar = new C8844i();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return iVar;
            } else if (b == 1) {
                iVar.f21724a = C8822aj.m17131b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                iVar.f21725b = C8820ah.m17128b(fVar);
            }
        }
    }
}
