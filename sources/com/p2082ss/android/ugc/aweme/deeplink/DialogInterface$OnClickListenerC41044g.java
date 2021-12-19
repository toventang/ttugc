package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.deeplink.g */
public final /* synthetic */ class DialogInterface$OnClickListenerC41044g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final DeepLinkHandlerActivity f95947a;

    /* renamed from: b */
    private final String f95948b;

    /* renamed from: c */
    private final String f95949c;

    static {
        Covode.recordClassIndex(48914);
    }

    DialogInterface$OnClickListenerC41044g(DeepLinkHandlerActivity deepLinkHandlerActivity, String str, String str2) {
        this.f95947a = deepLinkHandlerActivity;
        this.f95948b = str;
        this.f95949c = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f95947a.mo70184a(this.f95948b, this.f95949c, dialogInterface);
    }
}
