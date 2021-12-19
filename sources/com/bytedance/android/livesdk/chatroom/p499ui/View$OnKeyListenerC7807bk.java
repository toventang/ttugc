package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.KeyEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bk */
final /* synthetic */ class View$OnKeyListenerC7807bk implements View.OnKeyListener {

    /* renamed from: a */
    private final C7794bg f19374a;

    static {
        Covode.recordClassIndex(8602);
    }

    View$OnKeyListenerC7807bk(C7794bg bgVar) {
        this.f19374a = bgVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C7794bg bgVar = this.f19374a;
        if (66 != i || 1 != keyEvent.getAction()) {
            return false;
        }
        bgVar.mo14064e();
        return true;
    }
}
