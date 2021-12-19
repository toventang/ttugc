package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.p */
public final class C7619p implements AbstractC2724b<C7610h> {
    static {
        Covode.recordClassIndex(8394);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7610h mo7304a(C2730f fVar) {
        return m15632b(fVar);
    }

    /* renamed from: b */
    public static C7610h m15632b(C2730f fVar) {
        C7610h hVar = new C7610h();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return hVar;
            } else if (b == 1) {
                hVar.f18893a = fVar.mo7312d();
            } else if (b == 2) {
                hVar.f18894b = fVar.mo7313e();
            } else if (b == 3) {
                hVar.f18895c = fVar.mo7312d();
            } else if (b == 4) {
                hVar.f18896d = fVar.mo7313e();
            } else if (b == 6) {
                hVar.f18897e = C7613j.m15625b(fVar);
            } else if (b != 8) {
                C2731g.m7903c(fVar);
            } else {
                hVar.f18898f = fVar.mo7313e();
            }
        }
    }
}
