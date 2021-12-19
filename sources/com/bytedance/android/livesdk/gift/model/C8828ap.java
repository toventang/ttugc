package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.gift.model.ap */
public final class C8828ap implements AbstractC2724b<C8857u> {
    static {
        Covode.recordClassIndex(9709);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C8857u mo7304a(C2730f fVar) {
        return m17142b(fVar);
    }

    /* renamed from: b */
    public static C8857u m17142b(C2730f fVar) {
        C8857u uVar = new C8857u();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return uVar;
            } else if (b == 1) {
                uVar.f21775a = fVar.mo7314f();
            } else if (b == 2) {
                uVar.f21776b = fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                uVar.f21777c = fVar.mo7314f();
            }
        }
    }
}
