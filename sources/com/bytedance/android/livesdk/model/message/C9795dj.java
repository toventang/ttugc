package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.dj */
public final class C9795dj implements AbstractC2724b<C9894x> {
    static {
        Covode.recordClassIndex(11337);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9894x mo7304a(C2730f fVar) {
        return m18089b(fVar);
    }

    /* renamed from: b */
    public static C9894x m18089b(C2730f fVar) {
        C9894x xVar = new C9894x();
        xVar.f23927a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return xVar;
            } else if (b == 1) {
                xVar.f23927a.add(Long.valueOf(C2731g.m7902b(fVar)));
            } else if (b == 2) {
                xVar.f23928b = C2731g.m7902b(fVar);
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                xVar.f23929c = (int) C2731g.m7902b(fVar);
            }
        }
    }
}
