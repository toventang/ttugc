package com.bytedance.android.livesdk.userinfowidget;

import android.view.View;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.n */
final /* synthetic */ class View$OnClickListenerC11038n implements View.OnClickListener {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26581a;

    static {
        Covode.recordClassIndex(12656);
    }

    View$OnClickListenerC11038n(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26581a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f26581a;
        liveRoomUserInfoWidget.mo17855a(view);
        if (liveRoomUserInfoWidget.f26536q != null && liveRoomUserInfoWidget.f26536q.getOwner() != null && liveRoomUserInfoWidget.f26536q.getOwner().getSubscribeInfo() != null) {
            C6501b.C6502a.m13948a("livesdk_subscribe_icon_click").mo12646a("anchor_id", liveRoomUserInfoWidget.f26536q.getOwnerUserId()).mo12646a("room_id", liveRoomUserInfoWidget.f26536q.getId()).mo12651a("enter_from_merge", C6544e.m13987a()).mo12651a("enter_method", C6544e.m13990d()).mo12651a("action_type", "click").mo12651a("request_id", C6544e.m13997k()).mo12651a("video_id", C6544e.m13992f()).mo12651a("click_position", "live_left_corner").mo12655b();
        }
    }
}
