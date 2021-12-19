package com.bytedance.android.livesdk.p542g;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.g.d */
public final /* synthetic */ class DialogInterface$OnDismissListenerC8778d implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final DialogC8776b f21646a;

    static {
        Covode.recordClassIndex(9655);
    }

    DialogInterface$OnDismissListenerC8778d(DialogC8776b bVar) {
        this.f21646a = bVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogC8776b bVar = this.f21646a;
        C6905bf.m14776a().mo13208c();
        if (bVar.f21644h != null) {
            bVar.f21644h.onDismiss(bVar);
        }
    }
}
