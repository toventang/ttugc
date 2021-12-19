package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7111b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.c */
final /* synthetic */ class DialogInterface$OnClickListenerC7164c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C7111b f17851a;

    static {
        Covode.recordClassIndex(7910);
    }

    DialogInterface$OnClickListenerC7164c(C7111b bVar) {
        this.f17851a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7111b bVar = this.f17851a;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        bVar.finishWithResult(new C7111b.C7113b(true, (byte) 0));
    }
}
