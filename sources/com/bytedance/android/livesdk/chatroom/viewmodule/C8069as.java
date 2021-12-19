package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.as */
final /* synthetic */ class C8069as implements AbstractC89172b {

    /* renamed from: a */
    private final CommentWidget f20079a;

    static {
        Covode.recordClassIndex(8876);
    }

    C8069as(CommentWidget commentWidget) {
        this.f20079a = commentWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f20079a;
        if (commentWidget.f19839h != null) {
            commentWidget.f19839h.dismiss();
            commentWidget.f19839h = null;
        }
        if (commentWidget.f19844m != null) {
            commentWidget.f19844m.dismiss();
            commentWidget.f19844m = null;
        }
        return C89391z.f203057a;
    }
}
