package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.r */
public final class C7698r implements AbstractC2724b<C7693m> {
    static {
        Covode.recordClassIndex(8480);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7693m mo7304a(C2730f fVar) {
        C7693m mVar = new C7693m();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return mVar;
            } else if (b == 5) {
                mVar.f19070b = fVar.mo7314f();
            } else if (b == 6) {
                mVar.f19069a = fVar.mo7312d();
            } else if (b != 7) {
                C2731g.m7903c(fVar);
            } else {
                mVar.f19071c = fVar.mo7312d();
            }
        }
    }
}
