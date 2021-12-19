package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7367a;
import com.bytedance.android.livesdk.chatroom.p488c.C7382ao;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ak */
public final /* synthetic */ class C8061ak implements AbstractC88433f {

    /* renamed from: a */
    private final CommentWidget f20071a;

    static {
        Covode.recordClassIndex(8868);
    }

    C8061ak(CommentWidget commentWidget) {
        this.f20071a = commentWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        CommentWidget commentWidget = this.f20071a;
        if (obj instanceof C7367a) {
            commentWidget.onEvent((C7367a) obj);
        } else if (obj instanceof C7382ao) {
            commentWidget.onEvent((C7382ao) obj);
        }
    }
}
