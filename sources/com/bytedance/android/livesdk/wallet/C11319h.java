package com.bytedance.android.livesdk.wallet;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.wallet.h */
public final class C11319h implements AbstractC2724b<C11314c> {
    static {
        Covode.recordClassIndex(12957);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C11314c mo7304a(C2730f fVar) {
        return m20059b(fVar);
    }

    /* renamed from: b */
    public static C11314c m20059b(C2730f fVar) {
        C11314c cVar = new C11314c();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return cVar;
            } else if (b == 1) {
                cVar.f27055a = (int) fVar.mo7314f();
            } else if (b == 2) {
                cVar.f27056b = fVar.mo7312d();
            } else if (b == 3) {
                cVar.f27057c = String.valueOf(fVar.mo7313e());
            } else if (b == 5) {
                cVar.f27058d = fVar.mo7313e();
            } else if (b != 6) {
                C2731g.m7903c(fVar);
            } else {
                cVar.f27059e = fVar.mo7313e();
            }
        }
    }
}
