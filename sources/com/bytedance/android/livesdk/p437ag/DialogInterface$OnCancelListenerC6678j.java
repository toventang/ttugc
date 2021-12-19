package com.bytedance.android.livesdk.p437ag;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6655c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.j */
final /* synthetic */ class DialogInterface$OnCancelListenerC6678j implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final C6670f.AbstractC6671a f16573a;

    /* renamed from: b */
    private final AbstractC6655c f16574b;

    static {
        Covode.recordClassIndex(7416);
    }

    DialogInterface$OnCancelListenerC6678j(C6670f.AbstractC6671a aVar, AbstractC6655c cVar) {
        this.f16573a = aVar;
        this.f16574b = cVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f16574b.mo12799b();
    }
}
