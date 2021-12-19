package com.bytedance.android.live.core.p215e.p217b;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.e.b.b */
final /* synthetic */ class DialogInterface$OnDismissListenerC3887b implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final Runnable f10744a = null;

    static {
        Covode.recordClassIndex(4416);
    }

    DialogInterface$OnDismissListenerC3887b(Runnable runnable) {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable = this.f10744a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
