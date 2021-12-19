package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bo */
final /* synthetic */ class View$OnClickListenerC7811bo implements View.OnClickListener {

    /* renamed from: a */
    private final C7794bg f19382a;

    /* renamed from: b */
    private final int f19383b;

    static {
        Covode.recordClassIndex(8606);
    }

    View$OnClickListenerC7811bo(C7794bg bgVar, int i) {
        this.f19382a = bgVar;
        this.f19383b = i;
    }

    public final void onClick(View view) {
        C7794bg bgVar = this.f19382a;
        int i = this.f19383b;
        bgVar.mo14058a(i);
        bgVar.f19346n.setCurrentItem(i);
    }
}
