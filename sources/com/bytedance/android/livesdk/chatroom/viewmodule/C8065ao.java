package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ao */
final /* synthetic */ class C8065ao implements AbstractC89172b {

    /* renamed from: a */
    private final CommentWidget f20075a;

    static {
        Covode.recordClassIndex(8872);
    }

    C8065ao(CommentWidget commentWidget) {
        this.f20075a = commentWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f20075a;
        if (((Boolean) obj).booleanValue()) {
            commentWidget.getView().setVisibility(4);
        } else {
            commentWidget.getView().setVisibility(0);
        }
        C6555i.m14021b();
        C6555i.m9463b("ttlive_comment", "CommentWidget contentView status changed, visible:" + commentWidget.isShowing() + ", reason: DATA_KEYBOARD_STATUS");
        return C89391z.f203057a;
    }
}
