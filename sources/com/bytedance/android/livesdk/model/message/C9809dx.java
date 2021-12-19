package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.live.base.model.user.C3004j;
import com.bytedance.android.livesdk.model.message.C9609al;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.dx */
public final class C9809dx implements AbstractC2724b<C9609al.C9610a> {
    static {
        Covode.recordClassIndex(11351);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9609al.C9610a mo7304a(C2730f fVar) {
        return m18106b(fVar);
    }

    /* renamed from: b */
    public static C9609al.C9610a m18106b(C2730f fVar) {
        C9609al.C9610a aVar = new C9609al.C9610a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f23344a = C9810dy.m18108b(fVar);
            } else if (b == 2) {
                aVar.f23345b = C9810dy.m18108b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23346c = C3004j.m8316b(fVar);
            }
        }
    }
}
