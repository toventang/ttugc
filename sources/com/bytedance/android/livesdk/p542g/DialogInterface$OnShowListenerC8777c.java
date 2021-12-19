package com.bytedance.android.livesdk.p542g;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.g.c */
public final /* synthetic */ class DialogInterface$OnShowListenerC8777c implements DialogInterface.OnShowListener {

    /* renamed from: a */
    private final DialogC8776b f21645a;

    static {
        Covode.recordClassIndex(9654);
    }

    DialogInterface$OnShowListenerC8777c(DialogC8776b bVar) {
        this.f21645a = bVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        DialogC8776b bVar = this.f21645a;
        C6905bf.m14776a().mo13207b();
        if (bVar.f21643g != null) {
            bVar.f21643g.onShow(bVar);
        }
    }
}
