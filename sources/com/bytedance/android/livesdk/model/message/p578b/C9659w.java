package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.w */
public final class C9659w implements AbstractC2724b<C9642h> {
    static {
        Covode.recordClassIndex(11201);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9642h mo7304a(C2730f fVar) {
        return m17973b(fVar);
    }

    /* renamed from: b */
    public static C9642h m17973b(C2730f fVar) {
        C9642h hVar = new C9642h();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return hVar;
            } else if (b == 1) {
                hVar.f23490a = fVar.mo7314f();
            } else if (b == 2) {
                hVar.f23491b = fVar.mo7313e();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                hVar.f23492c = fVar.mo7314f();
            }
        }
    }
}
