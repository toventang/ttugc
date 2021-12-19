package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.deeplink.f */
public final /* synthetic */ class DialogInterface$OnClickListenerC41043f implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final DeepLinkHandlerActivity f95943a;

    /* renamed from: b */
    private final String f95944b;

    /* renamed from: c */
    private final String f95945c;

    /* renamed from: d */
    private final Context f95946d;

    static {
        Covode.recordClassIndex(48913);
    }

    DialogInterface$OnClickListenerC41043f(DeepLinkHandlerActivity deepLinkHandlerActivity, String str, String str2, Context context) {
        this.f95943a = deepLinkHandlerActivity;
        this.f95944b = str;
        this.f95945c = str2;
        this.f95946d = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f95943a.mo70183a(this.f95944b, this.f95945c, this.f95946d, dialogInterface);
    }
}
