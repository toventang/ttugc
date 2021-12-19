package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.u */
final /* synthetic */ class DialogInterface$OnClickListenerC7956u implements DialogInterface.OnClickListener {

    /* renamed from: a */
    static final DialogInterface.OnClickListener f19776a = new DialogInterface$OnClickListenerC7956u();

    static {
        Covode.recordClassIndex(8751);
    }

    private DialogInterface$OnClickListenerC7956u() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C6806c.m14603a((C6800c) AbstractC6804a.f17043cq, (Object) false);
        C6501b.C6502a.m13948a("livesdk_mini_window_pop_up_click").mo12651a("click_icon", "not_allowed").mo12655b();
        dialogInterface.dismiss();
    }
}
