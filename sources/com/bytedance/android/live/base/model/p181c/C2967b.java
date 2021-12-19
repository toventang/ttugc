package com.bytedance.android.live.base.model.p181c;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.base.model.c.b */
public final class C2967b implements AbstractC2724b<C2965a.C2966a> {
    static {
        Covode.recordClassIndex(3412);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C2965a.C2966a mo7304a(C2730f fVar) {
        return m8291b(fVar);
    }

    /* renamed from: b */
    public static C2965a.C2966a m8291b(C2730f fVar) {
        C2965a.C2966a aVar = new C2965a.C2966a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f8726a = fVar.mo7312d();
            }
        }
    }
}
