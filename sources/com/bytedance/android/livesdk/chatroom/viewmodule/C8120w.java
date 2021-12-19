package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.util.SparseBooleanArray;
import com.bytedance.android.live.p379n.C5784p;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.w */
final /* synthetic */ class C8120w implements AbstractC88433f {

    /* renamed from: a */
    private final CommentWidget f20132a;

    static {
        Covode.recordClassIndex(8927);
    }

    C8120w(CommentWidget commentWidget) {
        this.f20132a = commentWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        CommentWidget commentWidget = this.f20132a;
        C8454g gVar = (C8454g) obj;
        if (commentWidget.isVisibilityToUser() && gVar != null && gVar.f20901a != null && commentWidget.getView() != null && commentWidget.isViewValid()) {
            SparseBooleanArray sparseBooleanArray = gVar.f20901a;
            int i = gVar.f20902b;
            sparseBooleanArray.get(0);
            boolean z = sparseBooleanArray.get(2);
            boolean z2 = sparseBooleanArray.get(1);
            boolean z3 = !z;
            C7573e.m15564a(commentWidget.context, commentWidget.getView(), z3, gVar.f20903c);
            if (commentWidget.dataChannel == null) {
                return;
            }
            if (commentWidget.f19836e || (i != 1 && !z2)) {
                commentWidget.dataChannel.mo28320c(C5784p.class, Boolean.valueOf(z3));
            }
        }
    }
}
