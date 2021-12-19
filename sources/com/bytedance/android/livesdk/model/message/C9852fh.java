package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.fh */
public final class C9852fh implements AbstractC2724b<C9683bp> {
    static {
        Covode.recordClassIndex(11394);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9683bp mo7304a(C2730f fVar) {
        C9683bp bpVar = new C9683bp();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return bpVar;
            } else if (b == 1) {
                bpVar.f23564a = fVar.mo7314f();
            } else if (b == 2) {
                bpVar.f23565b = C9716r.m18010b(fVar);
            } else if (b == 3) {
                bpVar.f23566c = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                bpVar.f23567d = fVar.mo7312d();
            }
        }
    }
}
