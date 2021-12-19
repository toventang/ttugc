package com.bytedance.android.live.design.app;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.design.app.a */
final /* synthetic */ class View$OnClickListenerC4058a implements View.OnClickListener {

    /* renamed from: a */
    private final LiveDialog f11251a;

    static {
        Covode.recordClassIndex(4602);
    }

    View$OnClickListenerC4058a(LiveDialog liveDialog) {
        this.f11251a = liveDialog;
    }

    public final void onClick(View view) {
        this.f11251a.cancel();
    }
}
