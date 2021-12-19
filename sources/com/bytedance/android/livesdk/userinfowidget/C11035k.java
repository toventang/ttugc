package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.k */
final /* synthetic */ class C11035k implements AbstractC89172b {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26578a;

    static {
        Covode.recordClassIndex(12653);
    }

    C11035k(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26578a = liveRoomUserInfoWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f26578a;
        SubscribeBadge subscribeBadge = (SubscribeBadge) obj;
        if (!(liveRoomUserInfoWidget.f26536q == null || liveRoomUserInfoWidget.f26536q.getOwner() == null || liveRoomUserInfoWidget.f26536q.getOwner().getSubscribeInfo() == null)) {
            liveRoomUserInfoWidget.f26536q.getOwner().getSubscribeInfo().setSubscribeBadge(subscribeBadge);
            liveRoomUserInfoWidget.f26536q.getOwner().setSubscribeStatus(true);
            liveRoomUserInfoWidget.mo17857a(LiveRoomUserInfoWidget.EnumC11022a.SUBSCRIBED);
            C11226ao.m19883a(C11279p.m20001a(liveRoomUserInfoWidget.context), C3966y.m9660a((int) R.string.ema, liveRoomUserInfoWidget.f26525f.getText()), 0);
        }
        return C89391z.f203057a;
    }
}
