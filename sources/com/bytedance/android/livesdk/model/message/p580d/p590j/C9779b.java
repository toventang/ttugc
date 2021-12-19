package com.bytedance.android.livesdk.model.message.p580d.p590j;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.d.j.b */
public final class C9779b implements AbstractC2724b<C9778a> {
    static {
        Covode.recordClassIndex(11321);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9778a mo7304a(C2730f fVar) {
        return m18071b(fVar);
    }

    /* renamed from: b */
    public static C9778a m18071b(C2730f fVar) {
        C9778a aVar = new C9778a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23791b = C3004j.m8316b(fVar);
            } else if (b == 2) {
                aVar.f23792c = fVar.mo7314f();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23790a = fVar.mo7312d();
            }
        }
    }
}
