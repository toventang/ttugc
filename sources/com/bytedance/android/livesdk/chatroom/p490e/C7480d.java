package com.bytedance.android.livesdk.chatroom.p490e;

import com.bytedance.android.livesdk.chatroom.p488c.AbstractC7394l;
import com.bytedance.android.livesdk.chatroom.p488c.C7371ad;
import com.bytedance.android.livesdk.chatroom.p488c.C7374ag;
import com.bytedance.android.livesdk.p561j.C9064cc;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.e.d */
public final /* synthetic */ class C7480d implements AbstractC88433f {

    /* renamed from: a */
    private final C7477c f18581a;

    static {
        Covode.recordClassIndex(8250);
    }

    C7480d(C7477c cVar) {
        this.f18581a = cVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7477c cVar = this.f18581a;
        AbstractC7394l lVar = (AbstractC7394l) obj;
        if (cVar.f18624w != null && C9064cc.m17355a(cVar.f18624w) && cVar.f38654y != null && lVar != null) {
            if (lVar instanceof C7374ag) {
                cVar.mo13715a((C7374ag) lVar);
            } else if (lVar instanceof C7371ad) {
                cVar.mo13714a((C7371ad) lVar);
            }
        }
    }
}
