package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.o */
public final class C7618o implements AbstractC2724b<C7607f> {
    static {
        Covode.recordClassIndex(8393);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7607f mo7304a(C2730f fVar) {
        C7607f fVar2 = new C7607f();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fVar2;
            } else if (b == 1) {
                fVar2.f18879a = fVar.mo7314f();
            } else if (b == 2) {
                fVar2.f18880b = fVar.mo7313e();
            } else if (b == 5) {
                fVar2.f18882d = C2731g.m7901a(fVar);
            } else if (b == 6) {
                fVar2.f18881c = fVar.mo7312d();
            } else if (b == 7) {
                fVar2.f18884f = fVar.mo7312d();
            } else if (b != 8) {
                C2731g.m7903c(fVar);
            } else {
                fVar2.f18883e = C2731g.m7901a(fVar);
            }
        }
    }
}
