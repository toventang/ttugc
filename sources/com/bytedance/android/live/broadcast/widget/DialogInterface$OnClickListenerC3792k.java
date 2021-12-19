package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.widget.k */
public final /* synthetic */ class DialogInterface$OnClickListenerC3792k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C3788i f10522a;

    static {
        Covode.recordClassIndex(4318);
    }

    DialogInterface$OnClickListenerC3792k(C3788i iVar) {
        this.f10522a = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3788i iVar = this.f10522a;
        dialogInterface.dismiss();
        C6501b.C6502a.m13948a("livesdk_change_cover_window_click").mo12651a("result", "live").mo12652a((Map<String, String>) iVar.mo9132b()).mo12655b();
    }
}
