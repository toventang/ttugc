package com.bytedance.android.livesdk.gifttray.p556c;

import android.view.View;
import com.bytedance.android.live.p379n.C5792x;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.service.p625c.p634i.C10754a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.gifttray.c.g */
final /* synthetic */ class View$OnClickListenerC8896g implements View.OnClickListener {

    /* renamed from: a */
    private final C8890c f21938a;

    /* renamed from: b */
    private final DataChannel f21939b;

    static {
        Covode.recordClassIndex(9780);
    }

    View$OnClickListenerC8896g(C8890c cVar, DataChannel dataChannel) {
        this.f21938a = cVar;
        this.f21939b = dataChannel;
    }

    public final void onClick(View view) {
        C8890c cVar = this.f21938a;
        DataChannel dataChannel = this.f21939b;
        if (dataChannel != null && cVar.f21918c != null) {
            C10754a.m19352a("portrait");
            dataChannel.mo28320c(C5792x.class, new UserProfileEvent(cVar.f21918c.f21861z));
        }
    }
}
