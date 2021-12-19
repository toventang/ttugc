package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.C9625ax;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.ej */
public final class C9827ej implements AbstractC2724b<C9625ax.C9626a> {
    static {
        Covode.recordClassIndex(11369);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9625ax.C9626a mo7304a(C2730f fVar) {
        return m18126b(fVar);
    }

    /* renamed from: b */
    public static C9625ax.C9626a m18126b(C2730f fVar) {
        C9625ax.C9626a aVar = new C9625ax.C9626a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23442a = C9862fr.m18174b(fVar);
            }
        }
    }
}
