package com.bytedance.android.live.base.model.live;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.base.model.live.f */
public final class C2983f implements AbstractC2724b<C2980c> {
    static {
        Covode.recordClassIndex(3430);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C2980c mo7304a(C2730f fVar) {
        C2980c cVar = new C2980c();
        cVar.f8748c = new ArrayList();
        long a = fVar.mo7307a();
        while (fVar.mo7310b() != -1) {
            C2731g.m7903c(fVar);
        }
        fVar.mo7309a(a);
        return cVar;
    }
}
