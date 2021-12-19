package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.deeplink.j */
public final /* synthetic */ class DialogInterface$OnClickListenerC41047j implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final DeepLinkHandlerActivity f95952a;

    /* renamed from: b */
    private final boolean f95953b;

    /* renamed from: c */
    private final Intent f95954c;

    static {
        Covode.recordClassIndex(48917);
    }

    DialogInterface$OnClickListenerC41047j(DeepLinkHandlerActivity deepLinkHandlerActivity, boolean z, Intent intent) {
        this.f95952a = deepLinkHandlerActivity;
        this.f95953b = z;
        this.f95954c = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f95952a.mo70185a(this.f95953b, this.f95954c);
    }
}
