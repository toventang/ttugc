package com.bytedance.android.livesdk.chatroom.model.p495b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.k */
public final class C7672k implements AbstractC2724b<C7667f> {
    static {
        Covode.recordClassIndex(8454);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7667f mo7304a(C2730f fVar) {
        C7667f fVar2 = new C7667f();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return fVar2;
            } else if (b == 3) {
                fVar2.f19011b = C2731g.m7901a(fVar);
            } else if (b == 4) {
                fVar2.f19012c = fVar.mo7313e();
            } else if (b == 5) {
                fVar2.f19014e = fVar.mo7312d();
            } else if (b == 15) {
                fVar2.f19010a = fVar.mo7312d();
            } else if (b != 17) {
                C2731g.m7903c(fVar);
            } else {
                fVar2.f19013d = fVar.mo7312d();
            }
        }
    }
}
