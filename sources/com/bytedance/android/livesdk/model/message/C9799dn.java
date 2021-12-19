package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.dn */
public final class C9799dn implements AbstractC2724b<C9598ab> {
    static {
        Covode.recordClassIndex(11341);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9598ab mo7304a(C2730f fVar) {
        C9598ab abVar = new C9598ab();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return abVar;
            } else if (b == 1) {
                abVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                abVar.f23298a = fVar.mo7314f();
            } else if (b == 3) {
                abVar.f23299f = fVar.mo7314f();
            } else if (b == 4) {
                abVar.f23300g = fVar.mo7312d();
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                abVar.f23301h = fVar.mo7314f();
            }
        }
    }
}
