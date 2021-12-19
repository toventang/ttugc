package com.bytedance.ies.dmt.p1194ui.dialog;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.dmt.ui.dialog.b */
final /* synthetic */ class DialogInterface$OnClickListenerC17201b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C17197a f41096a;

    static {
        Covode.recordClassIndex(19661);
    }

    DialogInterface$OnClickListenerC17201b(C17197a aVar) {
        this.f41096a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C17197a aVar = this.f41096a;
        if (!aVar.f41042e) {
            C17197a.m31760a(dialogInterface);
        }
        if (aVar.f41039b != null) {
            aVar.f41039b.onClick(dialogInterface, i);
        }
    }
}
