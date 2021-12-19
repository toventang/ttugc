package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p441ah.C6682a;
import com.bytedance.android.livesdk.p441ah.C6684c;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p605r.C10330k;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.t */
final /* synthetic */ class DialogInterface$OnClickListenerC7955t implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final Activity f19775a;

    static {
        Covode.recordClassIndex(8750);
    }

    DialogInterface$OnClickListenerC7955t(Activity activity) {
        this.f19775a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.f19775a;
        C6806c.m14603a((C6800c) AbstractC6804a.f17043cq, (Object) true);
        if (!C6682a.m14195a()) {
            C6684c.C6686b.m14211a();
            C89219l.m154721d(activity, "");
            C10330k.m18811c(activity);
        }
        C6501b.C6502a.m13948a("livesdk_mini_window_pop_up_click").mo12651a("click_icon", "allow").mo12655b();
        dialogInterface.dismiss();
    }
}
