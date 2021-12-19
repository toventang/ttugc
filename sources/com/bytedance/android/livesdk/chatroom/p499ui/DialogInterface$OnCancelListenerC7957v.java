package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.v */
final /* synthetic */ class DialogInterface$OnCancelListenerC7957v implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    static final DialogInterface.OnCancelListener f19777a = new DialogInterface$OnCancelListenerC7957v();

    static {
        Covode.recordClassIndex(8752);
    }

    private DialogInterface$OnCancelListenerC7957v() {
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C6806c.m14603a((C6800c) AbstractC6804a.f17043cq, (Object) false);
        C6501b.C6502a.m13948a("livesdk_mini_window_pop_up_click").mo12651a("click_icon", "not_allowed").mo12655b();
    }
}
