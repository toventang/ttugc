package com.bytedance.android.live.broadcast.p192c.p193a;

import com.bytedance.android.live.broadcast.p192c.p193a.C3200g;
import com.bytedance.android.livesdk.model.message.C9888r;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.c.a.m */
final /* synthetic */ class C3208m implements AbstractC88433f {

    /* renamed from: a */
    private final C3200g.C32011 f9236a;

    static {
        Covode.recordClassIndex(3689);
    }

    C3208m(C3200g.C32011 r1) {
        this.f9236a = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.bytedance.android.livesdk.model.message.ce> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<com.bytedance.android.livesdk.model.message.ce> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C3200g gVar = C3200g.this;
        C9888r rVar = (C9888r) obj;
        if (rVar != null) {
            if (rVar.f23903e) {
                gVar.f9220a.add(0, rVar);
            } else {
                gVar.f9220a.add(rVar);
            }
            gVar.mo8556b();
        }
    }
}
