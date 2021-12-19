package com.bytedance.android.livesdk.p437ag;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ag.i */
final /* synthetic */ class DialogInterface$OnKeyListenerC6677i implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    static final DialogInterface.OnKeyListener f16572a = new DialogInterface$OnKeyListenerC6677i();

    static {
        Covode.recordClassIndex(7415);
    }

    private DialogInterface$OnKeyListenerC6677i() {
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            dialogInterface.cancel();
        }
        return true;
    }
}
