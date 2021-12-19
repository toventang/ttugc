package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.p385p.C5840e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.y */
final /* synthetic */ class View$OnClickListenerC8122y implements View.OnClickListener {

    /* renamed from: a */
    private final CommentWidget f20134a;

    static {
        Covode.recordClassIndex(8929);
    }

    View$OnClickListenerC8122y(CommentWidget commentWidget) {
        this.f20134a = commentWidget;
    }

    public final void onClick(View view) {
        CommentWidget commentWidget = this.f20134a;
        if (commentWidget.dataChannel != null) {
            commentWidget.dataChannel.mo28320c(C5840e.class, true);
        }
        commentWidget.mo14267b();
    }
}
