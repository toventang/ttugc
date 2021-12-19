package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.event.C8451d;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ag */
final /* synthetic */ class C8057ag implements AbstractC89172b {

    /* renamed from: a */
    private final CommentWidget f20067a;

    static {
        Covode.recordClassIndex(8864);
    }

    C8057ag(CommentWidget commentWidget) {
        this.f20067a = commentWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f20067a;
        C8451d dVar = (C8451d) obj;
        if (dVar != null) {
            commentWidget.mo14266a(dVar.f20894a, false, false, 0);
        }
        return C89391z.f203057a;
    }
}
