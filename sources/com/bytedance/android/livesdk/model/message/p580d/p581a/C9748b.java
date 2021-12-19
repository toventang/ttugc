package com.bytedance.android.livesdk.model.message.p580d.p581a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.a.b */
public final class C9748b implements AbstractC2724b<C9746a> {
    static {
        Covode.recordClassIndex(11290);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9746a mo7304a(C2730f fVar) {
        return m18042b(fVar);
    }

    /* renamed from: b */
    public static C9746a m18042b(C2730f fVar) {
        C9746a aVar = new C9746a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23726a = fVar.mo7314f();
            } else if (b == 2) {
                aVar.f23727b = fVar.mo7314f();
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23728c = (int) fVar.mo7314f();
            }
        }
    }
}
