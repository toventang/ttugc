package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.z */
final /* synthetic */ class C4936z implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12895a;

    static {
        Covode.recordClassIndex(5519);
    }

    C4936z(LinkControlWidget linkControlWidget) {
        this.f12895a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        this.f12895a.f12830d.mo10567a(LinkApi.EnumC7283a.INVITE_CANCEL);
        return C89391z.f203057a;
    }
}
