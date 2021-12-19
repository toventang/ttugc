package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.view.View;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.i */
public final class C8035i implements AbstractView$OnClickListenerC5841f {
    static {
        Covode.recordClassIndex(8842);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    public final void onClick(View view) {
        C6779a.m14563a().mo13053a(new C7400q(6));
        C3051c.C3052a.m8359a("ttlive_click_close_room").mo12632a();
    }
}
