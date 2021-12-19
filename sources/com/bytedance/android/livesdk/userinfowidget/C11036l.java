package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.l */
final /* synthetic */ class C11036l implements AbstractC88433f {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26579a;

    static {
        Covode.recordClassIndex(12654);
    }

    C11036l(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26579a = liveRoomUserInfoWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f26579a;
        User user = (User) obj;
        if (liveRoomUserInfoWidget.isViewValid()) {
            if (!C6204h.m13480b()) {
                user = User.from(user);
            }
            ((Room) liveRoomUserInfoWidget.dataChannel.mo28318b(C9093de.class)).getOwner().setFollowInfo(user.getFollowInfo());
            if (user.isFollowing()) {
                liveRoomUserInfoWidget.mo17857a(LiveRoomUserInfoWidget.EnumC11022a.FOLLOWED);
            } else if (liveRoomUserInfoWidget.f26540u) {
                liveRoomUserInfoWidget.mo17854a();
            } else {
                liveRoomUserInfoWidget.mo17857a(LiveRoomUserInfoWidget.EnumC11022a.UNFOLLOW);
                C13628n.m24510a(liveRoomUserInfoWidget.f26525f, 0);
            }
        }
    }
}
