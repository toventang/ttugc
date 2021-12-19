package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ap */
final /* synthetic */ class C8066ap implements AbstractC89172b {

    /* renamed from: a */
    private final CommentWidget f20076a;

    static {
        Covode.recordClassIndex(8873);
    }

    C8066ap(CommentWidget commentWidget) {
        this.f20076a = commentWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f20076a;
        Boolean bool = (Boolean) obj;
        if (commentWidget.getView() != null) {
            commentWidget.getView().setVisibility(bool.booleanValue() ? 8 : 0);
        }
        return C89391z.f203057a;
    }
}
