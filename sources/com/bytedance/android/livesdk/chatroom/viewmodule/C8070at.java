package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.at */
final /* synthetic */ class C8070at implements AbstractC89172b {

    /* renamed from: a */
    private final CommentWidget f20080a;

    static {
        Covode.recordClassIndex(8877);
    }

    C8070at(CommentWidget commentWidget) {
        this.f20080a = commentWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f20080a;
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && commentWidget.f19841j != null) {
            commentWidget.mo14264a(commentWidget.f19841j);
            commentWidget.f19841j = null;
        }
        if (!bool.booleanValue() && commentWidget.f19845n != null) {
            commentWidget.mo14265a(commentWidget.f19845n);
            commentWidget.f19845n = null;
        }
        return C89391z.f203057a;
    }
}
