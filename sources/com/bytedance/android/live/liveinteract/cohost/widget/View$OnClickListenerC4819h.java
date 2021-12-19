package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.p379n.C5792x;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.h */
final /* synthetic */ class View$OnClickListenerC4819h implements View.OnClickListener {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12670a;

    static {
        Covode.recordClassIndex(5401);
    }

    View$OnClickListenerC4819h(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12670a = linkCrossRoomWidget;
    }

    public final void onClick(View view) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f12670a;
        UserProfileEvent userProfileEvent = new UserProfileEvent(linkCrossRoomWidget.f12644h.f11958f);
        userProfileEvent.interactLogLabel = "right_anchor";
        linkCrossRoomWidget.dataChannel.mo28320c(C5792x.class, userProfileEvent);
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(linkCrossRoomWidget.f12642f.getOwnerUserId()));
        if (linkCrossRoomWidget.f12644h.f11970r == 0) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "pk");
        }
        C6501b.C6502a.m13948a("right_anchor_click").mo12652a((Map<String, String>) hashMap).mo12651a("enter_from", "live_detail").mo12658d("live_detail").mo12654b("live").mo12656c("click").mo12641a(C4384b.C4385a.m10496a().mo10155e()).mo12643a(linkCrossRoomWidget.dataChannel).mo12655b();
    }
}
