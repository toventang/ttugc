package com.p2082ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.policy.C63143a;

/* renamed from: com.ss.android.ugc.aweme.setting.services.d */
final /* synthetic */ class DialogInterface$OnShowListenerC68430d implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final Activity f153186a;

    static {
        Covode.recordClassIndex(80675);
    }

    DialogInterface$OnShowListenerC68430d(Activity activity) {
        this.f153186a = activity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        new C63143a(this.f153186a).mo101483a();
    }
}
