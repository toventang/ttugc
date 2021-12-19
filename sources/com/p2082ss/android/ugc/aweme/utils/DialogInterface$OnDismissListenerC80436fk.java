package com.p2082ss.android.ugc.aweme.utils;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.aweme.utils.C80429fh;

/* renamed from: com.ss.android.ugc.aweme.utils.fk */
final /* synthetic */ class DialogInterface$OnDismissListenerC80436fk implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    private final C80429fh.AbstractC80433a f180014a;

    /* renamed from: b */
    private final AbstractC63755f f180015b;

    static {
        Covode.recordClassIndex(93704);
    }

    DialogInterface$OnDismissListenerC80436fk(C80429fh.AbstractC80433a aVar, AbstractC63755f fVar) {
        this.f180014a = aVar;
        this.f180015b = fVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C80429fh.AbstractC80433a aVar = this.f180014a;
        AbstractC63755f fVar = this.f180015b;
        if (aVar != null) {
            aVar.mo60676a();
        }
        if (fVar != null) {
            fVar.mo96120b();
        }
    }
}
