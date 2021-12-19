package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7369ab;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.au */
final /* synthetic */ class C8071au implements AbstractC88433f {

    /* renamed from: a */
    private final DecorationWrapperWidget f20081a;

    static {
        Covode.recordClassIndex(8878);
    }

    C8071au(DecorationWrapperWidget decorationWrapperWidget) {
        this.f20081a = decorationWrapperWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f20081a.onEvent((C7369ab) obj);
    }
}
