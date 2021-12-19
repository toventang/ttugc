package com.p2082ss.android.ugc.aweme.aabplugin.core.base.view;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.view.d */
final /* synthetic */ class DialogInterface$OnDismissListenerC31358d implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final WeakReference f75137a;

    static {
        Covode.recordClassIndex(38060);
    }

    DialogInterface$OnDismissListenerC31358d(WeakReference weakReference) {
        this.f75137a = weakReference;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity = (Activity) this.f75137a.get();
        if (activity != null) {
            activity.finish();
        }
    }
}
