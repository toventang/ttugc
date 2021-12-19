package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.widget.j */
public final /* synthetic */ class DialogInterface$OnClickListenerC3791j implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C3788i f10521a;

    static {
        Covode.recordClassIndex(4317);
    }

    DialogInterface$OnClickListenerC3791j(C3788i iVar) {
        this.f10521a = iVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C3788i iVar = this.f10521a;
        dialogInterface.dismiss();
        iVar.f10511c.mo11513a();
        iVar.f10511c.mo11516c();
        C6501b.C6502a.m13948a("livesdk_change_cover_window_click").mo12651a("result", "confirm").mo12652a((Map<String, String>) iVar.mo9132b()).mo12655b();
    }
}
