package com.bytedance.android.livesdk.function;

import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.function.c */
final /* synthetic */ class C8758c implements AbstractC88433f {

    /* renamed from: a */
    private final LiveRoomNotifyWidget f21613a;

    static {
        Covode.recordClassIndex(9635);
    }

    C8758c(LiveRoomNotifyWidget liveRoomNotifyWidget) {
        this.f21613a = liveRoomNotifyWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f21613a;
        C8454g gVar = (C8454g) obj;
        if (gVar != null && gVar.f20901a != null && liveRoomNotifyWidget.getView() != null && liveRoomNotifyWidget.isViewValid()) {
            SparseBooleanArray sparseBooleanArray = gVar.f20901a;
            if (gVar.f20902b == 1) {
                C7573e.m15564a(liveRoomNotifyWidget.context, liveRoomNotifyWidget.getView(), !sparseBooleanArray.get(1), gVar.f20903c);
            }
        }
    }
}
