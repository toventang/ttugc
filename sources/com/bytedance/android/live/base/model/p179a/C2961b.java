package com.bytedance.android.live.base.model.p179a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.base.model.a.b */
public final class C2961b implements AbstractC2724b<C2960a> {
    static {
        Covode.recordClassIndex(3406);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C2960a mo7304a(C2730f fVar) {
        C2960a aVar = new C2960a();
        aVar.f8710b = new ArrayList();
        long a = fVar.mo7307a();
        while (fVar.mo7310b() != -1) {
            C2731g.m7903c(fVar);
        }
        fVar.mo7309a(a);
        return aVar;
    }
}
