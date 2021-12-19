package com.bytedance.android.livesdk.userinfowidget;

import android.view.View;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.b */
final /* synthetic */ class View$OnClickListenerC11026b implements View.OnClickListener {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26569a;

    static {
        Covode.recordClassIndex(12644);
    }

    View$OnClickListenerC11026b(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26569a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f26569a;
        if (!liveRoomUserInfoWidget.f26538s && liveRoomUserInfoWidget.f26545z != null && liveRoomUserInfoWidget.f26545z.isMicRoomForCurrentRoom() && liveRoomUserInfoWidget.f26536q != null && liveRoomUserInfoWidget.f26536q.officialChannelInfo != null && liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(liveRoomUserInfoWidget.f26536q.officialChannelInfo.f23136a.getId());
            userProfileEvent.mSource = "video_head";
            C6779a.m14563a().mo13053a(userProfileEvent);
        } else if (liveRoomUserInfoWidget.f26536q != null && liveRoomUserInfoWidget.f26536q.getOwner() != null) {
            UserProfileEvent userProfileEvent2 = new UserProfileEvent(liveRoomUserInfoWidget.f26536q.getOwner().getId());
            userProfileEvent2.mSource = "video_head";
            C6779a.m14563a().mo13053a(userProfileEvent2);
        }
    }
}
