package com.bytedance.android.livesdk.envelope.widget;

import android.view.View;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.livesdk.gift.p548d.C8802f;
import com.bytedance.android.livesdk.gift.p548d.C8805i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.envelope.widget.b */
public final class C8446b implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    public final DataChannel f20884a;

    static {
        Covode.recordClassIndex(9293);
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

    public C8446b(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f20884a = dataChannel;
    }

    public final void onClick(View view) {
        this.f20884a.mo28320c(C8802f.class, new C8805i("more"));
    }
}
