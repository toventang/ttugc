package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.o */
final /* synthetic */ class RunnableC7187o implements Runnable {

    /* renamed from: a */
    private final DialogInterface$OnCancelListenerC0944d f17893a;

    static {
        Covode.recordClassIndex(7933);
    }

    RunnableC7187o(DialogInterface$OnCancelListenerC0944d dVar) {
        this.f17893a = dVar;
    }

    public final void run() {
        this.f17893a.dismissAllowingStateLoss();
    }
}
