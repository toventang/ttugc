package com.bytedance.android.live.liveinteract.cohost.widget;

import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.j */
final /* synthetic */ class RunnableC4821j implements Runnable {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12672a;

    static {
        Covode.recordClassIndex(5403);
    }

    RunnableC4821j(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12672a = linkCrossRoomWidget;
    }

    public final void run() {
        EnumC5847l.INTERACTION_PK.unload(this.f12672a.dataChannel);
    }
}
