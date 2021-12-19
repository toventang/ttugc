package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cx */
final /* synthetic */ class DialogInterface$OnClickListenerC7875cx implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C7822br.C783217 f19598a;

    /* renamed from: b */
    private final int f19599b;

    /* renamed from: c */
    private final String f19600c;

    static {
        Covode.recordClassIndex(8670);
    }

    DialogInterface$OnClickListenerC7875cx(C7822br.C783217 r1, int i, String str) {
        this.f19598a = r1;
        this.f19599b = i;
        this.f19600c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7822br.C783217 r2 = this.f19598a;
        int i2 = this.f19599b;
        String str = this.f19600c;
        dialogInterface.dismiss();
        C7822br.this.mo14106a("user cancel, frame_fail", 208, (long) i2);
        Event event = new Event("live_play_enter_room_fail", 33807, EnumC11866b.ServerApiCall);
        event.mo19003a("enter room api return fail.You are live broadcasting dialog click cancel. error_code: " + i2 + ", error_prompt: " + str);
        C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
        C7822br.this.mo14099a(C7822br.EnumC7841a.ENTER_FAILED);
    }
}
