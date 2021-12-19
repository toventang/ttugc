package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.C2977f;
import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.bt */
public final class C9563bt implements AbstractC2724b<C9914v> {
    static {
        Covode.recordClassIndex(11102);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9914v mo7304a(C2730f fVar) {
        return m17880b(fVar);
    }

    /* renamed from: b */
    public static C9914v m17880b(C2730f fVar) {
        C9914v vVar = new C9914v();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return vVar;
            } else if (b == 1) {
                vVar.f24034b = C9716r.m18010b(fVar);
            } else if (b == 2) {
                vVar.f24033a = C2977f.m8301b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                vVar.f24035c = fVar.mo7312d();
            }
        }
    }
}
