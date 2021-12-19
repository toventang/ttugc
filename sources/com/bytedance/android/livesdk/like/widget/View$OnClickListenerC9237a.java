package com.bytedance.android.livesdk.like.widget;

import android.view.View;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.like.widget.a */
final /* synthetic */ class View$OnClickListenerC9237a implements View.OnClickListener {

    /* renamed from: a */
    private final Room f22501a;

    static {
        Covode.recordClassIndex(10149);
    }

    View$OnClickListenerC9237a(Room room) {
        this.f22501a = room;
    }

    public final void onClick(View view) {
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.f22501a.getOwner().getId());
        userProfileEvent.mSource = "video_head";
        C6779a.m14563a().mo13053a(userProfileEvent);
    }
}
