package com.bytedance.android.live.base.model.emoji;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.base.model.emoji.d */
public final class C2975d implements AbstractC2724b<C2974c> {
    static {
        Covode.recordClassIndex(3421);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C2974c mo7304a(C2730f fVar) {
        return m8297b(fVar);
    }

    /* renamed from: b */
    public static C2974c m8297b(C2730f fVar) {
        C2974c cVar = new C2974c();
        cVar.f8741b = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b == 1) {
                cVar.f8740a = fVar.mo7313e();
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f8741b.add(C2976e.m8299b(fVar));
            }
        }
    }
}
