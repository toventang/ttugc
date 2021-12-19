package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.platform.common.p371c.C5684c;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.y */
final /* synthetic */ class C4935y implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12894a;

    static {
        Covode.recordClassIndex(5518);
    }

    C4935y(LinkControlWidget linkControlWidget) {
        this.f12894a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        Object b;
        LinkControlWidget linkControlWidget = this.f12894a;
        if (!(((Boolean) obj).booleanValue() || (b = linkControlWidget.dataChannel.mo28318b(C5684c.class)) == null || b == LinkApi.EnumC7285c.USER_CLICK)) {
            linkControlWidget.f12830d.mo10568a(LinkApi.EnumC7287e.RESTART_AFTER_CO_HOST);
        }
        return C89391z.f203057a;
    }
}
