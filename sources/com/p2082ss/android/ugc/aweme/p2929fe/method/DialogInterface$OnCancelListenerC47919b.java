package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47909a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.fe.method.b */
public final /* synthetic */ class DialogInterface$OnCancelListenerC47919b implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final AbstractC47909a.C47912a f110990a;

    static {
        Covode.recordClassIndex(56616);
    }

    DialogInterface$OnCancelListenerC47919b(AbstractC47909a.C47912a aVar) {
        this.f110990a = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AbstractC47909a.C47912a aVar = this.f110990a;
        if (aVar.f110968a.get() != null) {
            aVar.f110968a.get().mo79939a();
        }
    }
}
