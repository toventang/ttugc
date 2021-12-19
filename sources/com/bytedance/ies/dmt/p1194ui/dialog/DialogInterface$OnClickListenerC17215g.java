package com.bytedance.ies.dmt.p1194ui.dialog;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.g */
final /* synthetic */ class DialogInterface$OnClickListenerC17215g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C17197a f41125a;

    static {
        Covode.recordClassIndex(19676);
    }

    DialogInterface$OnClickListenerC17215g(C17197a aVar) {
        this.f41125a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17197a aVar = this.f41125a;
        if (!aVar.f41043f) {
            C17197a.m31760a(dialogInterface);
        }
        if (aVar.f41040c != null) {
            aVar.f41040c.onClick(dialogInterface, i);
        }
    }
}
