package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.C9668bf;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.et */
public final class C9837et implements AbstractC2724b<C9668bf.C9669a> {
    static {
        Covode.recordClassIndex(11379);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9668bf.C9669a mo7304a(C2730f fVar) {
        return m18140b(fVar);
    }

    /* renamed from: b */
    public static C9668bf.C9669a m18140b(C2730f fVar) {
        C9668bf.C9669a aVar = new C9668bf.C9669a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23527a = fVar.mo7313e();
            } else if (b == 3) {
                aVar.f23529c = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23530d = fVar.mo7313e();
            }
        }
    }
}
