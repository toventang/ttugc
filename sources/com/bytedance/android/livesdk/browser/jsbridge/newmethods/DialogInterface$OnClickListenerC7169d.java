package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7111b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.d */
final /* synthetic */ class DialogInterface$OnClickListenerC7169d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C7111b f17860a;

    static {
        Covode.recordClassIndex(7915);
    }

    DialogInterface$OnClickListenerC7169d(C7111b bVar) {
        this.f17860a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7111b bVar = this.f17860a;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        bVar.finishWithResult(new C7111b.C7113b(false, (byte) 0));
    }
}
