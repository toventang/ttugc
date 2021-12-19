package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cq */
final /* synthetic */ class C7868cq implements AbstractC88433f {

    /* renamed from: a */
    private final C7822br f19591a;

    static {
        Covode.recordClassIndex(8663);
    }

    C7868cq(C7822br brVar) {
        this.f19591a = brVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f19591a.onEvent((C8452e) obj);
    }
}
