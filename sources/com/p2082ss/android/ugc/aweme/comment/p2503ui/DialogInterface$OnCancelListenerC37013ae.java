package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36540c;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ae */
final /* synthetic */ class DialogInterface$OnCancelListenerC37013ae implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final C37157k f87181a;

    static {
        Covode.recordClassIndex(44367);
    }

    DialogInterface$OnCancelListenerC37013ae(C37157k kVar) {
        this.f87181a = kVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C37157k kVar = this.f87181a;
        C36540c.m74385a(kVar.f87622b.getEventType(), "cancel", kVar.f87622b.getAuthorUid(), kVar.f87622b.getAid());
    }
}
