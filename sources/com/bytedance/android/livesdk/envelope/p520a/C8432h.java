package com.bytedance.android.livesdk.envelope.p520a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.envelope.a.h */
public final class C8432h implements AbstractC2724b<C8429e> {
    static {
        Covode.recordClassIndex(9277);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8429e mo7304a(C2730f fVar) {
        C8429e eVar = new C8429e((char) 0);
        eVar.f20859a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return eVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                eVar.f20859a.add(C8431g.m16640b(fVar));
            }
        }
    }
}
