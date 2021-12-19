package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.m */
public final class C7616m implements AbstractC2724b<C7605d> {
    static {
        Covode.recordClassIndex(8391);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7605d mo7304a(C2730f fVar) {
        C7605d dVar = new C7605d();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return dVar;
            } else if (b == 1) {
                dVar.f18857a = C2731g.m7901a(fVar);
            } else if (b == 2) {
                dVar.f18858b = fVar.mo7312d();
            } else if (b == 3) {
                dVar.f18859c = fVar.mo7312d();
            } else if (b == 4) {
                dVar.f18860d = C2731g.m7901a(fVar);
            } else if (b != 5) {
                C2731g.m7903c(fVar);
            } else {
                dVar.f18861e = fVar.mo7312d();
            }
        }
    }
}
