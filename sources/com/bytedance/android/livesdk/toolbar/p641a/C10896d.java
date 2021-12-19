package com.bytedance.android.livesdk.toolbar.p641a;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.p446aj.C6761b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.toolbar.a.d */
public final class C10896d implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    View f26184a;

    /* renamed from: b */
    Context f26185b;

    /* renamed from: c */
    private C6761b f26186c;

    static {
        Covode.recordClassIndex(12504);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    public final void onClick(View view) {
    }

    public C10896d(Context context) {
        this.f26185b = context;
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        this.f26184a = view;
        C6203g.m13469c(new RunnableC10897e(this, dataChannel, view));
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        C6761b bVar = this.f26186c;
        if (bVar != null) {
            if (bVar.f16795a != null) {
                bVar.f16795a.dismiss();
            }
            this.f26186c = null;
        }
    }
}
