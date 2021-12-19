package com.bytedance.android.live.wallet;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.wallet.aa */
final /* synthetic */ class DialogInterface$OnClickListenerC6291aa implements DialogInterface.OnClickListener {

    /* renamed from: a */
    static final DialogInterface.OnClickListener f15725a = new DialogInterface$OnClickListenerC6291aa();

    static {
        Covode.recordClassIndex(7004);
    }

    private DialogInterface$OnClickListenerC6291aa() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C6501b.C6502a.m13948a("livesdk_auto_balance_exchange_click").mo12651a("click", "cancel").mo12655b();
    }
}
