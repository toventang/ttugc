package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.at */
public final /* synthetic */ class DialogInterface$OnClickListenerC11474at implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final Context f27536a;

    static {
        Covode.recordClassIndex(13133);
    }

    public DialogInterface$OnClickListenerC11474at(Context context) {
        this.f27536a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((IHostApp) C6193a.m13435a(IHostApp.class)).openWallet(C11279p.m20001a(this.f27536a));
        dialogInterface.dismiss();
    }
}
