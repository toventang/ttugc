package com.bytedance.android.livesdk.toolbar.p641a;

import android.view.View;
import com.bytedance.android.live.gift.C4343s;
import com.bytedance.android.live.gift.C4344t;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.toolbar.a.a */
public final class C10893a implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    private final Room f26180a;

    /* renamed from: b */
    private final DataChannel f26181b;

    static {
        Covode.recordClassIndex(12501);
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
        if (this.f26181b != null) {
            C8803g gVar = new C8803g();
            gVar.f21680b = "icon";
            this.f26181b.mo28320c(C4344t.class, gVar);
        }
        DataChannel dataChannel = this.f26181b;
        if (dataChannel != null) {
            dataChannel.mo28319c(C4343s.class);
            if (((Boolean) this.f26181b.mo28318b(C9119ed.class)).booleanValue()) {
                C6501b.C6502a.m13948a("livesdk_anchor_gift_click").mo12643a(this.f26181b).mo12651a("live_type", C11729j.m20684a(this.f26180a.getStreamType())).mo12655b();
            }
        }
    }

    public C10893a(Room room, DataChannel dataChannel) {
        this.f26180a = room;
        this.f26181b = dataChannel;
    }
}
