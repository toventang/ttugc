package com.bytedance.android.livesdk.model.message.p580d.p582b;

import com.bytedance.android.livesdk.model.message.p580d.p586f.C9768d;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.d.b.b */
public final class C9750b implements AbstractC2724b<C9749a> {
    static {
        Covode.recordClassIndex(11292);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9749a mo7304a(C2730f fVar) {
        return m18044b(fVar);
    }

    /* renamed from: b */
    public static C9749a m18044b(C2730f fVar) {
        C9749a aVar = new C9749a();
        aVar.f23730a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23730a.add(C9768d.m18061b(fVar));
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23731b = (long) fVar.mo7313e();
            }
        }
    }
}
