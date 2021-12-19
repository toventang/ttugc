package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7369ab;
import com.bytedance.android.livesdk.chatroom.p488c.C7377aj;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bc */
final /* synthetic */ class C8080bc implements AbstractC88433f {

    /* renamed from: a */
    private final DecorationWrapperWidget f20094a;

    static {
        Covode.recordClassIndex(8887);
    }

    C8080bc(DecorationWrapperWidget decorationWrapperWidget) {
        this.f20094a = decorationWrapperWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f20094a.onEvent(new C7369ab(((C7377aj) obj).f18289a));
    }
}
