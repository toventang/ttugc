package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.cx */
public final class C9742cx implements AbstractC2724b<C9882m> {
    static {
        Covode.recordClassIndex(11284);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9882m mo7304a(C2730f fVar) {
        return m18037b(fVar);
    }

    /* renamed from: b */
    public static C9882m m18037b(C2730f fVar) {
        C9882m mVar = new C9882m();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return mVar;
            } else if (b == 1) {
                mVar.f23879b = fVar.mo7314f();
            } else if (b == 2) {
                mVar.f23878a = C3004j.m8316b(fVar);
            } else if (b == 3) {
                mVar.f23880c = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                mVar.f23881d = fVar.mo7314f();
            }
        }
    }
}
