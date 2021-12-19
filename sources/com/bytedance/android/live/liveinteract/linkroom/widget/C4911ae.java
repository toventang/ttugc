package com.bytedance.android.live.liveinteract.linkroom.widget;

import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.AbstractC4434e;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAnchorAvatarBgWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC7601b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.ae */
public final class C4911ae implements AbstractC4434e {
    static {
        Covode.recordClassIndex(5494);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4434e
    /* renamed from: b */
    public final LiveWidget mo10214b() {
        return new MultiGuestAnchorAvatarBgWidget();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4434e
    /* renamed from: a */
    public final LiveWidget mo10212a() {
        return new MultiGuestAsAnchorWidget();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4434e
    /* renamed from: a */
    public final BaseLinkWidget mo10211a(FrameLayout frameLayout) {
        return new LinkCrossRoomWidget(frameLayout);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4434e
    /* renamed from: a */
    public final BaseLinkControlWidget mo10210a(BaseLinkControlWidget.AbstractC4381a aVar) {
        C89219l.m154721d(aVar, "");
        return new LinkControlWidget(aVar);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4434e
    /* renamed from: b */
    public final LiveWidget mo10215b(FrameLayout frameLayout) {
        C89219l.m154721d(frameLayout, "");
        return new MultiGuestAsGuestWidget(frameLayout);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4434e
    /* renamed from: a */
    public final void mo10213a(AbstractC7601b bVar) {
        if (bVar != null) {
            C4431e.f12034a.mo10198a(bVar, "LIVE_VIDEO_CLIENT_FACTORY");
        }
    }
}
