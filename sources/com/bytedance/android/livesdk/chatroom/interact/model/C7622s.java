package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.livesdk.chatroom.interact.model.C7611i;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.s */
public final class C7622s implements AbstractC2724b<C7611i.C7612a> {
    static {
        Covode.recordClassIndex(8397);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7611i.C7612a mo7304a(C2730f fVar) {
        return m15637b(fVar);
    }

    /* renamed from: b */
    public static C7611i.C7612a m15637b(C2730f fVar) {
        C7611i.C7612a aVar = new C7611i.C7612a();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b == 1) {
                aVar.f18903a = fVar.mo7312d();
            } else if (b == 2) {
                aVar.f18904b = fVar.mo7312d();
            } else if (b == 3) {
                aVar.f18905c = fVar.mo7312d();
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f18906d = C2731g.m7901a(fVar);
            }
        }
    }
}
