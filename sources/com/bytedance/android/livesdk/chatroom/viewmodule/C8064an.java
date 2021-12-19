package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.event.C8448b;
import com.bytedance.android.livesdk.p561j.C9120ee;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.an */
final /* synthetic */ class C8064an implements AbstractC89172b {

    /* renamed from: a */
    private final CommentWidget f20074a;

    static {
        Covode.recordClassIndex(8871);
    }

    C8064an(CommentWidget commentWidget) {
        this.f20074a = commentWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f20074a;
        C8448b bVar = (C8448b) obj;
        if (commentWidget.isViewValid() && !commentWidget.f19833b) {
            commentWidget.dataChannel.mo28311a(C9120ee.class, bVar);
            if (commentWidget.f19848q != null) {
                commentWidget.f19848q.mo14037a(bVar);
            } else {
                commentWidget.f19849r.f19038c = bVar.f20888a;
                commentWidget.f19849r.f19039d = bVar.f20889b;
            }
        }
        return C89391z.f203057a;
    }
}
