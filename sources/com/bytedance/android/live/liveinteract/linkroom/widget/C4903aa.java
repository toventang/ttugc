package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.aa */
final /* synthetic */ class C4903aa implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12856a;

    static {
        Covode.recordClassIndex(5486);
    }

    C4903aa(LinkControlWidget linkControlWidget) {
        this.f12856a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f12856a;
        linkControlWidget.f12830d.mo10571d();
        linkControlWidget.f12830d.mo10567a(LinkApi.EnumC7283a.INVITE_CANCEL);
        if (LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() != 0) {
            C4384b.C4385a.m10496a().f11943af = false;
            linkControlWidget.mo10637c(false);
        }
        return C89391z.f203057a;
    }
}
