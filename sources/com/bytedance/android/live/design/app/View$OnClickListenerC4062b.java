package com.bytedance.android.live.design.app;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.design.app.b */
public final /* synthetic */ class View$OnClickListenerC4062b implements View.OnClickListener {

    /* renamed from: a */
    private final LiveDialog f11256a;

    static {
        Covode.recordClassIndex(4606);
    }

    View$OnClickListenerC4062b(LiveDialog liveDialog) {
        this.f11256a = liveDialog;
    }

    public final void onClick(View view) {
        this.f11256a.cancel();
    }
}
