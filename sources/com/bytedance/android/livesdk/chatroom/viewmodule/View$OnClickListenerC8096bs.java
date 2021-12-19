package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.livesdk.drawerfeed.C8422f;
import com.bytedance.android.livesdk.livesetting.other.LiveDrawerVersion;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bs */
final /* synthetic */ class View$OnClickListenerC8096bs implements View.OnClickListener {

    /* renamed from: a */
    private final LiveDrawerEntranceWidget f20107a;

    static {
        Covode.recordClassIndex(8903);
    }

    View$OnClickListenerC8096bs(LiveDrawerEntranceWidget liveDrawerEntranceWidget) {
        this.f20107a = liveDrawerEntranceWidget;
    }

    public final void onClick(View view) {
        LiveDrawerEntranceWidget liveDrawerEntranceWidget = this.f20107a;
        Bundle bundle = new Bundle();
        bundle.putString("pull_type", "button");
        bundle.putLong("room_id", ((Long) liveDrawerEntranceWidget.dataChannel.mo28318b(C9096dh.class)).longValue());
        if (LiveDrawerVersion.INSTANCE.getValue()) {
            C8422f.m16637a(C3888a.m9505a(liveDrawerEntranceWidget.getContext()), true, bundle, "button");
        } else {
            C2695a.f8059g.f8064d = "button";
            C8422f.m16638a(C3888a.m9505a(liveDrawerEntranceWidget.getContext()), true);
        }
        C6501b.C6502a.m13948a("livesdk_explore_click").mo12643a(liveDrawerEntranceWidget.dataChannel).mo12651a("ops_type", "click").mo12655b();
    }
}
