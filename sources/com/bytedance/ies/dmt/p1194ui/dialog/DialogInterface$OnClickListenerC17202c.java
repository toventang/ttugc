package com.bytedance.ies.dmt.p1194ui.dialog;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.c */
final /* synthetic */ class DialogInterface$OnClickListenerC17202c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C17197a f41097a;

    static {
        Covode.recordClassIndex(19662);
    }

    DialogInterface$OnClickListenerC17202c(C17197a aVar) {
        this.f41097a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17197a aVar = this.f41097a;
        if (!aVar.f41044g) {
            C17197a.m31760a(dialogInterface);
        }
        if (aVar.f41041d != null) {
            aVar.f41041d.onClick(dialogInterface, i);
        }
    }
}
