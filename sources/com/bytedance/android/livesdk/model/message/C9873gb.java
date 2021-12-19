package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdkapi.p692h.C11783f;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.gb */
public final class C9873gb implements AbstractC2724b<C9724cg> {
    static {
        Covode.recordClassIndex(11415);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9724cg mo7304a(C2730f fVar) {
        C9724cg cgVar = new C9724cg();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cgVar;
            } else if (b == 1) {
                cgVar.f28134O = C11783f.m20759b(fVar);
            } else if (b == 2) {
                cgVar.f23714a = fVar.mo7312d();
            } else if (b == 3) {
                cgVar.f23715f = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                cgVar.f23716g = fVar.mo7314f();
            }
        }
    }
}
