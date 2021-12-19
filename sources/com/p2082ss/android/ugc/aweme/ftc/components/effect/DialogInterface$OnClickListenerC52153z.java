package com.p2082ss.android.ugc.aweme.ftc.components.effect;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.effect.z */
final /* synthetic */ class DialogInterface$OnClickListenerC52153z implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C52125f f120147a;

    static {
        Covode.recordClassIndex(61534);
    }

    DialogInterface$OnClickListenerC52153z(C52125f fVar) {
        this.f120147a = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C52125f fVar = this.f120147a;
        dialogInterface.dismiss();
        fVar.f120080S = 1;
        fVar.mo87850b();
        fVar.mo87861h();
    }
}
