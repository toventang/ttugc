package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7376ai;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.av */
final /* synthetic */ class C8072av implements AbstractC88433f {

    /* renamed from: a */
    private final DecorationWrapperWidget f20082a;

    static {
        Covode.recordClassIndex(8879);
    }

    C8072av(DecorationWrapperWidget decorationWrapperWidget) {
        this.f20082a = decorationWrapperWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f20082a.onEvent((C7376ai) obj);
    }
}
