package com.bytedance.android.livesdk.userinfowidget;

import android.view.View;
import com.bytedance.android.live.core.p218f.C3958s;
import com.bytedance.android.live.gift.C4343s;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.c */
final /* synthetic */ class View$OnClickListenerC11027c implements View.OnClickListener {

    /* renamed from: a */
    private final LiveRoomUserInfoWidget f26570a;

    static {
        Covode.recordClassIndex(12645);
    }

    View$OnClickListenerC11027c(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f26570a = liveRoomUserInfoWidget;
    }

    public final void onClick(View view) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f26570a;
        liveRoomUserInfoWidget.mo17854a();
        if (C3958s.m9646b(liveRoomUserInfoWidget.dataChannel) && !liveRoomUserInfoWidget.f26539t && liveRoomUserInfoWidget.dataChannel != null) {
            liveRoomUserInfoWidget.dataChannel.mo28319c(C4343s.class);
        }
    }
}
