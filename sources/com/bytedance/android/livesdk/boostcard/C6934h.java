package com.bytedance.android.livesdk.boostcard;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.boostcard.h */
public final class C6934h implements AbstractC2724b<C6931e> {
    static {
        Covode.recordClassIndex(7673);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C6931e mo7304a(C2730f fVar) {
        C6931e eVar = new C6931e();
        eVar.f17336a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return eVar;
            } else if (b == 1) {
                eVar.f17337b = C2731g.m7902b(fVar);
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                eVar.f17336a.add(C6932f.m14794b(fVar));
            }
        }
    }
}
