package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.r */
public final class C7621r implements AbstractC2724b<RivalsListExtra> {
    static {
        Covode.recordClassIndex(8396);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ RivalsListExtra mo7304a(C2730f fVar) {
        RivalsListExtra rivalsListExtra = new RivalsListExtra();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return rivalsListExtra;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                rivalsListExtra.logPbBean = C7620q.m15634b(fVar);
            }
        }
    }
}
