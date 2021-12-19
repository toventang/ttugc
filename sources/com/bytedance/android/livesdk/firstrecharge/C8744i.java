package com.bytedance.android.livesdk.firstrecharge;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.firstrecharge.i */
public final class C8744i implements AbstractC2724b<C8727b> {
    static {
        Covode.recordClassIndex(9618);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8727b mo7304a(C2730f fVar) {
        return m17064b(fVar);
    }

    /* renamed from: b */
    public static C8727b m17064b(C2730f fVar) {
        C8727b bVar = new C8727b();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bVar;
            } else if (b == 1) {
                bVar.f21538a = C2731g.m7901a(fVar);
            } else if (b == 2) {
                bVar.f21539b.add(Integer.valueOf(fVar.mo7313e()));
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                bVar.f21540c = fVar.mo7313e();
            }
        }
    }
}
