package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.livesdk.chatroom.C7298b;
import com.bytedance.android.livesdk.chatroom.p488c.C7396m;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.w */
final /* synthetic */ class C8197w implements AbstractC88433f {

    /* renamed from: a */
    private final SplitScreenWidget f20322a;

    static {
        Covode.recordClassIndex(9020);
    }

    C8197w(SplitScreenWidget splitScreenWidget) {
        this.f20322a = splitScreenWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        SplitScreenWidget splitScreenWidget = this.f20322a;
        C7396m mVar = (C7396m) obj;
        if (splitScreenWidget.f20243a != null && C7298b.m15199a(splitScreenWidget.dataChannel) && mVar != null && mVar.f18324b == 1) {
            splitScreenWidget.mo14389a(!mVar.f18323a.get(1, false), true);
        }
    }
}
