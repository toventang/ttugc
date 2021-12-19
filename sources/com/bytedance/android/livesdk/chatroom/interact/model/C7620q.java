package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.q */
public final class C7620q implements AbstractC2724b<RivalsListExtra.LogPbBean> {
    static {
        Covode.recordClassIndex(8395);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ RivalsListExtra.LogPbBean mo7304a(C2730f fVar) {
        return m15634b(fVar);
    }

    /* renamed from: b */
    public static RivalsListExtra.LogPbBean m15634b(C2730f fVar) {
        RivalsListExtra.LogPbBean logPbBean = new RivalsListExtra.LogPbBean();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return logPbBean;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                logPbBean.imprId = fVar.mo7312d();
            }
        }
    }
}
