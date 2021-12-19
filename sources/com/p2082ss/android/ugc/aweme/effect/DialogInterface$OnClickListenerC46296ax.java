package com.p2082ss.android.ugc.aweme.effect;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.effect.ax */
final /* synthetic */ class DialogInterface$OnClickListenerC46296ax implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C46267ac f107933a;

    static {
        Covode.recordClassIndex(54873);
    }

    DialogInterface$OnClickListenerC46296ax(C46267ac acVar) {
        this.f107933a = acVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C46267ac acVar = this.f107933a;
        dialogInterface.dismiss();
        acVar.f107858S = 1;
        acVar.mo78756c();
        acVar.mo78766j();
    }
}
